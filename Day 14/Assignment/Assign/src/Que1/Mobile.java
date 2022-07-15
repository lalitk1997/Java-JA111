package Que1;

public class Mobile {
    public void searchOutdatedModel(String mobCompany, String... mobModel){
        // accepts mobile company / model name
        String[] outdatedModels = {"note4", "note5", "note6", "note7"};
        for(int i=0; i<outdatedModels.length; i++){
            for(int j=0; j<mobModel.length; j++){
                if(outdatedModels[i] == mobModel[j]){
                    System.out.println(mobModel[j]+"_OUTDATED");
                }
            }
        }
    }
    public static void main(String[] args) {
        Mobile mob = new Mobile();
        mob.searchOutdatedModel("Samsung", "note4", "note5", "note10");
        System.out.println("-x-x-x-x-x-x-");
        mob.searchOutdatedModel("Nokia", "PureView", "GTC-3312", "note7");
        System.out.println("-x-x-x-x-x-x-");
        mob.searchOutdatedModel("Apple");
    }
}
