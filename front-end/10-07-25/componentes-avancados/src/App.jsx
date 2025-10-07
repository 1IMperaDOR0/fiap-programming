// src/App.jsx
import { useState } from 'react'
import Button from './components/Button'
import Card from './components/Card'
import Input from './components/Input'
import Badge from './components/Badge'
import Modal from './components/Modal'
import Avatar from './components/Avatar'
import DashboardCard from './components/DashboardCard'
import Toast from './components/Toast'
import ProgressBar from './components/ProgressBar'
import Tabs from './components/Tabs'
import Rating from './components/Rating'

function App() {
  const [isModalOpen, setIsModalOpen] = useState(false)
  const [inputValue, setInputValue] = useState('')
  const [inputError, setInputError] = useState('')
  const [loading, setLoading] = useState(false)
  // Adicione estes estados no App.jsx
const [toasts, setToasts] = useState([])
const [progress, setProgress] = useState(0)
const [rating, setRating] = useState(0)

// Adicione estas funções
const addToast = (type, title, message) => {
  const id = Date.now()
  const newToast = { id, type, title, message }
  setToasts(prev => [...prev, newToast])
}

const removeToast = (id) => {
  setToasts(prev => prev.filter(toast => toast.id !== id))
}

const simulateProgress = () => {
  setProgress(0)
  const interval = setInterval(() => {
    setProgress(prev => {
      if (prev >= 100) {
        clearInterval(interval)
        addToast('success', 'Concluído!', 'Processo finalizado com sucesso.')
        return 100
      }
      return prev + 10
    })
  }, 200)
}

  const handleSubmit = () => {
    setLoading(true)
    setTimeout(() => {
      setLoading(false)
      if (!inputValue) {
        setInputError('Este campo é obrigatório')
      } else {
        setInputError('')
        alert('Formulário enviado com sucesso!')
      }
    }, 2000)
  }

  return (
    <div className="min-h-screen bg-gray-50 p-8">
      <div className="max-w-6xl mx-auto space-y-12">

        {/* Header */}
        <div className="text-center">
          <h1 className="text-4xl font-bold text-gray-900 mb-4">
            Biblioteca de Componentes
          </h1>
          <p className="text-lg text-gray-600">
            Componentes reutilizáveis construídos com Tailwind CSS + React
          </p>
        </div>

        {/* Dashboard Card Section */}
        <Card
          header={<h2 className="text-2xl font-semibold">Dashboard Card</h2>}
          className="w-full"
        >
          <div className="grid grid-cols-1 md:grid-cols-2 lg:grid-cols-3 gap-6">
            <DashboardCard
              user={{
                name: "Lucas Sousa",
                role: "Professor",
                avatar: "https://picsum.photos/100?random=3",
                initials: "LS",
                status: "online",
                active: true
              }}
              stats={[
                { label: "Projetos", value: 12 },
                { label: "Alunos", value: 250 },
                { label: "Cursos", value: 5 }
              ]}
              actions={[
                { label: "Editar", variant: "primary", onClick: () => alert("Editar usuário") },
                { label: "Excluir", variant: "danger", onClick: () => alert("Excluir usuário") }
              ]}
            />

            <DashboardCard
              user={{
                name: "Maria Silva",
                role: "Engenheira de Software",
                avatar: "https://picsum.photos/100?random=4",
                initials: "MS",
                status: "away",
                active: false
              }}
              stats={[
                { label: "Commits", value: 532 },
                { label: "Pull Requests", value: 48 },
                { label: "Issues", value: 19 }
              ]}
              actions={[
                { label: "Ativar", variant: "success", onClick: () => alert("Usuário ativado!") },
                { label: "Detalhes", variant: "outline", onClick: () => alert("Abrir detalhes") }
              ]}
            />
          </div>
        </Card>

        {/* Buttons Section */}
        <Card
          header={<h2 className="text-2xl font-semibold">Buttons</h2>}
          className="w-full"
        >
          <div className="space-y-6">
            <div>
              <h3 className="text-sm font-medium text-gray-700 mb-3">Variants</h3>
              <div className="flex flex-wrap gap-3">
                <Button variant="primary">Primary</Button>
                <Button variant="secondary">Secondary</Button>
                <Button variant="success">Success</Button>
                <Button variant="danger">Danger</Button>
                <Button variant="outline">Outline</Button>
                <Button variant="ghost">Ghost</Button>
              </div>
            </div>

            <div>
              <h3 className="text-sm font-medium text-gray-700 mb-3">Sizes</h3>
              <div className="flex flex-wrap items-center gap-3">
                <Button size="xs">Extra Small</Button>
                <Button size="sm">Small</Button>
                <Button size="md">Medium</Button>
                <Button size="lg">Large</Button>
                <Button size="xl">Extra Large</Button>
              </div>
            </div>

            <div>
              <h3 className="text-sm font-medium text-gray-700 mb-3">States</h3>
              <div className="flex flex-wrap gap-3">
                <Button disabled>Disabled</Button>
                <Button loading={loading} onClick={handleSubmit}>
                  {loading ? 'Loading...' : 'Click me'}
                </Button>
                <Button
                  icon={<svg className="w-4 h-4" fill="currentColor" viewBox="0 0 24 24"><path d="M19 13h-6v6h-2v-6H5v-2h6V5h2v6h6v2z" /></svg>}
                >
                  With Icon
                </Button>
              </div>
            </div>
          </div>
        </Card>

        {/* Cards Section */}
        <Card
          header={<h2 className="text-2xl font-semibold">Cards</h2>}
          className="w-full"
        >
          <div className="grid grid-cols-1 md:grid-cols-2 lg:grid-cols-3 gap-6">
            <Card variant="default">
              <h3 className="font-semibold mb-2">Default Card</h3>
              <p className="text-gray-600">Card básico com sombra sutil.</p>
            </Card>

            <Card variant="elevated" hover>
              <h3 className="font-semibold mb-2">Elevated Card</h3>
              <p className="text-gray-600">Card com sombra maior e hover effect.</p>
            </Card>

            <Card
              variant="gradient"
              header={
                <div className="flex items-center gap-3">
                  <Avatar initials="JD" size="sm" />
                  <span className="font-medium">John Doe</span>
                </div>
              }
              footer={
                <div className="flex gap-2">
                  <Badge variant="primary">React</Badge>
                  <Badge variant="success">Tailwind</Badge>
                </div>
              }
            >
              <p className="text-gray-600">Card com header, footer e gradient.</p>
            </Card>
          </div>
        </Card>

        {/* Inputs Section */}
        <Card
          header={<h2 className="text-2xl font-semibold">Inputs</h2>}
          className="w-full"
        >
          <div className="grid grid-cols-1 md:grid-cols-2 gap-6">
            <Input
              label="Nome completo"
              placeholder="Digite seu nome"
              required
              value={inputValue}
              onChange={(e) => setInputValue(e.target.value)}
              error={inputError}
            />

            <Input
              label="Email"
              type="email"
              placeholder="seu@email.com"
              success={inputValue && !inputError}
              icon={<svg className="w-4 h-4" fill="currentColor" viewBox="0 0 24 24"><path d="M20 4H4c-1.1 0-1.99.9-1.99 2L2 18c0 1.1.89 2 2 2h16c1.1 0 2-.9 2-2V6c0-1.1-.9-2-2-2zm0 4l-8 5-8-5V6l8 5 8-5v2z" /></svg>}
            />

            <Input
              label="Senha"
              type="password"
              placeholder="••••••••"
              helper="Mínimo 8 caracteres"
            />

            <Input
              label="Campo desabilitado"
              placeholder="Não editável"
              disabled
              value="Valor fixo"
            />
          </div>
        </Card>

        {/* Badges and Avatars */}
        <Card
          header={<h2 className="text-2xl font-semibold">Badges & Avatars</h2>}
          className="w-full"
        >
          <div className="space-y-6">
            <div>
              <h3 className="text-sm font-medium text-gray-700 mb-3">Badges</h3>
              <div className="flex flex-wrap gap-2">
                <Badge variant="default">Default</Badge>
                <Badge variant="primary">Primary</Badge>
                <Badge variant="success">Success</Badge>
                <Badge variant="warning">Warning</Badge>
                <Badge variant="danger">Danger</Badge>
                <Badge variant="info" removable onRemove={() => alert('Badge removida!')}>
                  Removable
                </Badge>
              </div>
            </div>

            <div>
              <h3 className="text-sm font-medium text-gray-700 mb-3">Avatars</h3>
              <div className="flex flex-wrap items-center gap-4">
                <Avatar initials="AB" size="xs" />
                <Avatar initials="CD" size="sm" status="online" />
                <Avatar
                  src="https://picsum.photos/100/100?random=1"
                  size="md"
                  status="busy"
                />
                <Avatar initials="EF" size="lg" variant="square" status="away" />
                <Avatar
                  src="https://picsum.photos/100/100?random=2"
                  size="xl"
                  variant="rounded"
                />
                <Avatar initials="GH" size="2xl" status="offline" />
              </div>
            </div>
          </div>
        </Card>

        {/* Modal Section */}
        <Card
          header={<h2 className="text-2xl font-semibold">Modal</h2>}
          className="w-full"
        >
          <div className="space-y-4">
            <Button onClick={() => setIsModalOpen(true)}>
              Abrir Modal
            </Button>

            <Modal
              isOpen={isModalOpen}
              onClose={() => setIsModalOpen(false)}
              title="Exemplo de Modal"
              size="lg"
            >
              <div className="space-y-4">
                <p className="text-gray-600">
                  Este é um exemplo de modal responsivo e acessível construído com React e Tailwind CSS.
                </p>

                <Input
                  label="Campo dentro do modal"
                  placeholder="Digite algo..."
                />

                <div className="flex gap-3 pt-4">
                  <Button onClick={() => setIsModalOpen(false)}>
                    Confirmar
                  </Button>
                  <Button
                    variant="outline"
                    onClick={() => setIsModalOpen(false)}
                  >
                    Cancelar
                  </Button>
                </div>
              </div>
            </Modal>
          </div>
        </Card>

        {/* Toasts & Progress */}
<Card 
  header={<h2 className="text-2xl font-semibold">Toasts & Progress</h2>}
  className="w-full"
>
  <div className="space-y-6">
    <div>
      <h3 className="text-sm font-medium text-gray-700 mb-3">Toast Notifications</h3>
      <div className="flex flex-wrap gap-2">
        <Button 
          size="sm" 
          variant="success"
          onClick={() => addToast('success', 'Sucesso!', 'Operação realizada com sucesso.')}
        >
          Success Toast
        </Button>
        <Button 
          size="sm" 
          variant="danger"
          onClick={() => addToast('error', 'Erro!', 'Algo deu errado na operação.')}
        >
          Error Toast
        </Button>
        <Button 
          size="sm" 
          className="bg-yellow-500 hover:bg-yellow-600"
          onClick={() => addToast('warning', 'Atenção!', 'Verifique os dados inseridos.')}
        >
          Warning Toast
        </Button>
        <Button 
          size="sm" 
          className="bg-cyan-500 hover:bg-cyan-600"
          onClick={() => addToast('info', 'Informação', 'Dados atualizados recentemente.')}
        >
          Info Toast
        </Button>
      </div>
    </div>
    
    <div>
      <h3 className="text-sm font-medium text-gray-700 mb-3">Progress Bar</h3>
      <div className="space-y-4">
        <ProgressBar 
          value={progress} 
          label="Progresso atual"
          showLabel
          variant="primary"
        />
        <Button onClick={simulateProgress} disabled={progress > 0 && progress < 100}>
          Simular Progresso
        </Button>
      </div>
    </div>
  </div>
</Card>

{/* Tabs */}
<Card className="w-full">
  <Tabs
    tabs={[
      {
        label: 'Informações Gerais',
        icon: '📋',
        content: (
          <div className="space-y-4">
            <Input label="Nome da empresa" placeholder="Digite o nome..." />
            <Input label="CNPJ" placeholder="00.000.000/0000-00" />
            <div className="grid grid-cols-1 md:grid-cols-2 gap-4">
              <Input label="Telefone" placeholder="(11) 99999-9999" />
              <Input label="Email" type="email" placeholder="contato@empresa.com" />
            </div>
          </div>
        )
      },
      {
        label: 'Endereço',
        icon: '📍',
        badge: '2',
        content: (
          <div className="space-y-4">
            <Input label="CEP" placeholder="00000-000" />
            <Input label="Rua" placeholder="Nome da rua..." />
            <div className="grid grid-cols-1 md:grid-cols-3 gap-4">
              <Input label="Número" placeholder="123" />
              <Input label="Complemento" placeholder="Apto 45" />
              <Input label="Bairro" placeholder="Centro" />
            </div>
          </div>
        )
      },
      {
        label: 'Avaliação',
        icon: '⭐',
        content: (
          <div className="space-y-6">
            <div>
              <label className="block text-sm font-medium text-gray-700 mb-2">
                Como você avalia nosso serviço?
              </label>
              <Rating 
                value={rating}
                onChange={setRating}
                size="lg"
                showLabel
              />
            </div>
            <Input 
              label="Comentários adicionais"
              placeholder="Deixe sua opinião..."
              helper="Opcional - nos ajude a melhorar"
            />
          </div>
        )
      }
    ]}
    variant="pills"
  />
</Card>

{/* Render Toasts */}
{toasts.map(toast => (
  <Toast
    key={toast.id}
    type={toast.type}
    title={toast.title}
    message={toast.message}
    onClose={() => removeToast(toast.id)}
  />
))}

      </div>
    </div>
  )
}

export default App