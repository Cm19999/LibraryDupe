package company;

import java.util.ArrayList;

public abstract class Physical extends LibraryArtifact{




    public Physical(String name,ArrayList<LibraryArtifact> libraryCollection) {
        super(name);
        this.libraryCollection=this.getLibraryCollection();
    }

    public Physical(String name) {
        super(name);
    }

    public abstract String use();


}
