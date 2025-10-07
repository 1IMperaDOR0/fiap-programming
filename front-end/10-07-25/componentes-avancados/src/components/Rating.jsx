// src/components/Rating.jsx
import { useState } from 'react'

const Rating = ({
  value = 0,
  maxRating = 5,
  size = 'md',
  readonly = false,
  onChange = () => {},
  showLabel = false,
  className = ''
}) => {
  const [hoverRating, setHoverRating] = useState(0)
  const [currentRating, setCurrentRating] = useState(value)
  
  const sizes = {
    sm: 'w-4 h-4',
    md: 'w-6 h-6',
    lg: 'w-8 h-8'
  }
  
  const handleClick = (rating) => {
    if (!readonly) {
      setCurrentRating(rating)
      onChange(rating)
    }
  }
  
  const handleMouseEnter = (rating) => {
    if (!readonly) {
      setHoverRating(rating)
    }
  }
  
  const handleMouseLeave = () => {
    if (!readonly) {
      setHoverRating(0)
    }
  }
  
  const getStarColor = (index) => {
    const rating = hoverRating || currentRating
    return index <= rating ? 'text-yellow-400' : 'text-gray-300'
  }
  
  return (
    <div className={`flex items-center gap-2 ${className}`}>
      <div className="flex items-center gap-1">
        {[...Array(maxRating)].map((_, index) => {
          const starValue = index + 1
          return (
            <button
              key={index}
              type="button"
              disabled={readonly}
              onClick={() => handleClick(starValue)}
              onMouseEnter={() => handleMouseEnter(starValue)}
              onMouseLeave={handleMouseLeave}
              className={`
                transition-colors duration-150
                ${readonly ? 'cursor-default' : 'cursor-pointer hover:scale-110'}
                ${getStarColor(starValue)}
                ${sizes[size]}
              `}
            >
              <svg
                fill="currentColor"
                viewBox="0 0 24 24"
                className="w-full h-full"
              >
                <path d="M12 2l3.09 6.26L22 9.27l-5 4.87 1.18 6.88L12 17.77l-6.18 3.25L7 14.14 2 9.27l6.91-1.01L12 2z"/>
              </svg>
            </button>
          )
        })}
      </div>
      
      {showLabel && (
        <span className="text-sm text-gray-600 ml-2">
          {currentRating} de {maxRating}
        </span>
      )}
    </div>
  )
}

export default Rating