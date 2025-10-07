// src/components/ProgressBar.jsx
import { useEffect, useState } from 'react'

const ProgressBar = ({
  value = 0,
  max = 100,
  size = 'md',
  variant = 'primary',
  animated = false,
  showLabel = false,
  label = '',
  className = ''
}) => {
  const [currentValue, setCurrentValue] = useState(0)
  
  const sizes = {
    sm: 'h-2',
    md: 'h-4',
    lg: 'h-6'
  }
  
  const variants = {
    primary: 'bg-blue-500',
    success: 'bg-green-500',
    warning: 'bg-yellow-500',
    danger: 'bg-red-500'
  }
  
  const percentage = Math.min(Math.max((value / max) * 100, 0), 100)
  
  useEffect(() => {
    const timer = setTimeout(() => {
      setCurrentValue(percentage)
    }, 100)
    
    return () => clearTimeout(timer)
  }, [percentage])
  
  return (
    <div className={`w-full ${className}`}>
      {(showLabel || label) && (
        <div className="flex justify-between items-center mb-2">
          <span className="text-sm font-medium text-gray-700">
            {label}
          </span>
          {showLabel && (
            <span className="text-sm font-medium text-gray-700">
              {Math.round(percentage)}%
            </span>
          )}
        </div>
      )}
      
      <div className={`
        bg-gray-200 rounded-full overflow-hidden
        ${sizes[size]}
      `}>
        <div
          className={`
            h-full rounded-full transition-all duration-500 ease-out
            ${variants[variant]}
            ${animated ? 'animate-pulse' : ''}
          `}
          style={{ width: `${currentValue}%` }}
        />
      </div>
    </div>
  )
}

export default ProgressBar