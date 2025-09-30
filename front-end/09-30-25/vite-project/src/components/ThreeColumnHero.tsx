export default function ThreeColumnHero() {
  return (
    <section className="h-screen grid grid-cols-1 md:grid-cols-3 gap-4 p-6">
      <div className="col-span-1 md:col-span-2 flex flex-col justify-center bg-gradient-to-r from-blue-600 via-purple-600 to-pink-500 text-white p-8 rounded-lg">
        <h1 className="text-5xl md:text-7xl font-extrabold mb-4">Explore o Mundo</h1>
        <p className="text-lg md:text-2xl leading-relaxed">
          Uma experiência visual imersiva com React, Tailwind e imagens de altíssima qualidade.
        </p>
      </div>
      <div className="hidden md:block relative overflow-hidden rounded-lg">
        <img
          src="https://picsum.photos/2680/1770"
          alt="Imagem aleatória"
          className="object-cover w-full h-full"
        />
      </div>
    </section>
  );
}