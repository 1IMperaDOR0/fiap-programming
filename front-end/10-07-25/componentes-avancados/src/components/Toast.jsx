// src/components/Toast.jsx
import { useState, useEffect } from 'react'

const Toast = ({ 
  type = 'info',
  title = '',
  message = '',
  duration = 5000,
  onClose = () => {},
  isVisible = true
}) => {
  const [show, setShow] = useState(isVisible)
  
  const types = {
    success: {
      bg: 'bg-green-50 border-green-200',
      icon: 'text-green-400',
      text: 'text-green-800',
      iconPath: 'M9 16.17L4.83 12l-1.42 1.41L9 19 21 7l-1.41-1.41z'
    },
    error: {
      bg: 'bg-red-50 border-red-200',
      icon: 'text-red-400',
      text: 'text-red-800',
      iconPath: 'M12 2C6.48 2 2 6.48 2 12s4.48 10 10 10 10-4.48 10-10S17.52 2 12 2zm1 15h-2v-2h2v2zm0-4h-2V7h2v6z'
    },
    warning: {
      bg: 'bg-yellow-50 border-yellow-200',
      icon: 'text-yellow-400',
      text: 'text-yellow-800',
      iconPath: 'M1 21h22L12 2 1 21zm12-3h-2v-2h2v2zm0-4h-2v-4h2v4z'
    },
    info: {
      bg: 'bg-blue-50 border-blue-200',
      icon: 'text-blue-400',
      text: 'text-blue-800',
      iconPath: 'M12 2C6.48 2 2 6.48 2 12s4.48 10 10 10 10-4.48 10-10S17.52 2 12 2zm1 15h-2v-6h2v6zm0-8h-2V7h2v2z'
    }
  }
  
  useEffect(() => {
    if (duration > 0) {
      const timer = setTimeout(() => {
        setShow(false)
        setTimeout(onClose, 300) // Aguarda animação
      }, duration)
      
      return () => clearTimeout(timer)
    }
  }, [duration, onClose])
  
  const currentType = types[type]
  
  return (
    <div className={`
      fixed top-4 right-4 z-50 transform transition-all duration-300 ease-in-out
      ${show ? 'translate-x-0 opacity-100' : 'translate-x-full opacity-0'}
    `}>
      <div className={`
        max-w-sm w-full border rounded-lg p-4 shadow-lg
        ${currentType.bg}
      `}>
        <div className="flex items-start gap-3">
          <div className={`flex-shrink-0 ${currentType.icon}`}>
            <svg className="w-5 h-5" fill="currentColor" viewBox="0 0 24 24">
              <path d={currentType.iconPath} />
            </svg>
          </div>
          
          <div className="flex-1">
            {title && (
              <h4 className={`font-medium ${currentType.text}`}>
                {title}
              </h4>
            )}
            <p className={`text-sm ${currentType.text} ${title ? 'mt-1' : ''}`}>
              {message}
            </p>
          </div>
          
          <button
            onClick={() => {
              setShow(false)
              setTimeout(onClose, 300)
            }}
            className={`flex-shrink-0 ${currentType.icon} hover:opacity-70`}
          >
            <svg className="w-4 h-4" fill="currentColor" viewBox="0 0 24 24">
              <path d="M19 6.41L17.59 5 12 10.59 6.41 5 5 6.41 10.59 12 5 17.59 6.41 19 12 13.41 17.59 19 19 17.59 13.41 12z"/>
            </svg>
          </button>
        </div>
      </div>
    </div>
  )
}

export default Toast