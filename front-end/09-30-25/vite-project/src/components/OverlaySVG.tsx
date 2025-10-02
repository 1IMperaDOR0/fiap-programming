export default function OverlaySVG() {
  return (
    <div className="relative h-[400px] w-full bg-gray-800 overflow-hidden">
      <img
        src="https://picsum.photos/1200/400"
        alt="Abstract"
        className="absolute inset-0 w-full h-full object-cover opacity-50"
      />
      <div className="relative z-20 flex flex-col items-center justify-center h-full text-center text-white px-4">
        <h2 className="text-4xl md:text-6xl font-extrabold mb-4">Bem-vindo(a)</h2>
        <p className="text-lg md:text-2xl">Tailwind + React com camadas visuais ricas</p>
        <svg
          className="w-16 h-16 md:w-24 md:h-24 mt-6 text-pink-400 z-30"
          fill="currentColor"
          viewBox="0 0 24 24"
        >
          <path d="M12 2L2 12h3v7h6v-4h2v4h6v-7h3z" />
        </svg>
      </div>
      <div className="absolute bottom-0 right-0 z-10 p-4">
        <svg
          className="w-32 h-32 text-blue-500 opacity-70"
          fill="currentColor"
          viewBox="0 0 24 24"
        >
          <circle cx="12" cy="12" r="10" />
        </svg>
      </div>
    </div>
  );
}