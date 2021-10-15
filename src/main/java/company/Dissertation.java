package company;

public class Dissertation extends Document implements Borrow{

    private String objectType = "Dissertation";
        Dissertation(String name,String Author){
            super(name,Author);
        }

    @Override
    public String toString() {
        return "Dissertation{" +
                " Name= "+this.getName()+'\''+
                " Author= "+this.getAuthor()+'\''+
                '}';
    }
        public String use(){
            return "What an informative dissertation";
        }

        public String store(){
            return "Store this with the other dissertations";
        }

        public String borrowItem(){
            return "You have borrowed a dissertation";
        }

        @Override
        public LibraryArtifact returnItem() {
            return (this);
    }
}
