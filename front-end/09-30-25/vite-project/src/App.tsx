import ThreeColumnHero from "./components/ThreeColumnHero";
import DecoratedText from "./components/DecoratedText";
import FloatedImageArticle from "./components/FloatedImageArticle";
import OverlaySVG from "./components/OverlaySVG";
import Flex from "./components/Flex";
import Grid from "./components/Grid";
import Tipografia from "./components/Tipografia";
import GalleryHybrid from "./components/GalleryHybrid";

function App() {
  return (
    <div className="space-y-12">
      <ThreeColumnHero />
      <DecoratedText />
      <FloatedImageArticle />
      <OverlaySVG />
      <Flex />
      <Grid />
      <Tipografia />
      <GalleryHybrid />
    </div>
  );
}

export default App;