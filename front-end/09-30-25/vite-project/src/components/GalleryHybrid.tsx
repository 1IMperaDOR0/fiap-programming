const images = [
  "https://picsum.photos/600?random=1",
  "https://picsum.photos/600?random=2",
  "https://picsum.photos/600?random=3",
  "https://picsum.photos/600?random=4",
  "https://picsum.photos/600?random=5",
  "https://picsum.photos/600?random=6"
];

export default function GalleryHybrid() {
  return (
    <section className="p-6">
      <div className="grid grid-cols-1 md:grid-cols-3 gap-6">
        {images.slice(0, 3).map((src, i) => (
          <div key={i} className="h-64 overflow-hidden rounded-lg shadow-lg">
            <img src={src} alt={`Gallery ${i}`} className="object-cover w-full h-full transform hover:scale-110 transition-transform duration-500" />
          </div>
        ))}
      </div>
      <div className="mt-6 flex flex-wrap md:hidden gap-4 justify-center">
        {images.slice(3).map((src, i) => (
          <div key={i} className="w-32 h-32 overflow-hidden rounded-lg shadow-md">
            <img src={src} alt={`Gallery small ${i}`} className="object-cover w-full h-full" />
          </div>
        ))}
      </div>
    </section>
  );
}