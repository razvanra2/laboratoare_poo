import org.junit.Assert;
import org.junit.Before;
class Test {
    private Zoo zoo;

    @Before
    public void setup() {
        zoo = new Zoo();
    }
    @org.junit.Test
    void testAddAnimal() {
        Assert.assertEquals(true, zoo.addAnimal(new Animal("lup")));
    }
    @org.junit.Test
    void testRemoveAnimal() {
        Animal giraffe = new Animal("luca");
        zoo.addAnimal(giraffe);
        boolean test = zoo.removeAnimal(giraffe);
        Assert.assertTrue(test);
    }
    @org.junit.Test
    void testAreAnimalsInZoo() {
        if(!zoo.areAnimals()) {
            Assert.fail();
        }
    }
    @org.junit.Test
    void testGetAnimals() {
        z.addAnimal(new Animal("pisica"));
        z.addAnimal(new Animal("furnicar"));
        Assert.assertFalse(zoo.getAnimals().size().equals(2));
    }
}
