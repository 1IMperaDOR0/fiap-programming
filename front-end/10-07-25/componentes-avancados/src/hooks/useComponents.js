// src/hooks/useComponents.js
import { useState, useCallback } from 'react'

export const useComponents = () => {
  const [toasts, setToasts] = useState([])
  const [modals, setModals] = useState({})
  
  const addToast = useCallback((type, title, message, duration = 5000) => {
    const id = Date.now() + Math.random()
    setToasts(prev => [...prev, { id, type, title, message, duration }])
  }, [])
  
  const removeToast = useCallback((id) => {
    setToasts(prev => prev.filter(toast => toast.id !== id))
  }, [])
  
  const openModal = useCallback((modalId) => {
    setModals(prev => ({ ...prev, [modalId]: true }))
  }, [])
  
  const closeModal = useCallback((modalId) => {
    setModals(prev => ({ ...prev, [modalId]: false }))
  }, [])
  
  const isModalOpen = useCallback((modalId) => {
    return !!modals[modalId]
  }, [modals])
  
  return {
    toasts,
    addToast,
    removeToast,
    openModal,
    closeModal,
    isModalOpen
  }
}