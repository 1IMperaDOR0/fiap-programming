// src/components/Tabs.jsx
import { useState } from 'react'

const Tabs = ({ 
  tabs = [],
  defaultTab = 0,
  variant = 'default',
  className = ''
}) => {
  const [activeTab, setActiveTab] = useState(defaultTab)
  
  const variants = {
    default: {
      container: 'border-b border-gray-200',
      tab: 'py-2 px-4 text-sm font-medium border-b-2 transition-colors',
      active: 'text-blue-600 border-blue-600',
      inactive: 'text-gray-500 border-transparent hover:text-gray-700 hover:border-gray-300'
    },
    pills: {
      container: 'bg-gray-100 p-1 rounded-lg',
      tab: 'py-2 px-4 text-sm font-medium rounded-md transition-all',
      active: 'bg-white text-gray-900 shadow-sm',
      inactive: 'text-gray-600 hover:text-gray-900'
    }
  }
  
  const currentVariant = variants[variant]
  
  return (
    <div className={className}>
      {/* Tab Navigation */}
      <div className={`flex space-x-1 ${currentVariant.container}`}>
        {tabs.map((tab, index) => (
          <button
            key={index}
            onClick={() => setActiveTab(index)}
            className={`
              ${currentVariant.tab}
              ${activeTab === index 
                ? currentVariant.active 
                : currentVariant.inactive
              }
            `}
          >
            {tab.icon && (
              <span className="mr-2">{tab.icon}</span>
            )}
            {tab.label}
            {tab.badge && (
              <span className="ml-2 bg-gray-200 text-gray-700 py-0.5 px-2 rounded-full text-xs">
                {tab.badge}
              </span>
            )}
          </button>
        ))}
      </div>
      
      {/* Tab Content */}
      <div className="mt-6">
        {tabs[activeTab]?.content}
      </div>
    </div>
  )
}

export default Tabs