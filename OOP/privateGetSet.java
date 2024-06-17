class privateGetSet {
    private int id;
    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return id;
    }
    public static void main(String[] args){
        privateGetSet ab=new privateGetSet();
        ab.setId(71);
        System.out.println(ab.getId());
    }
}
/*class emp{
    public static void main(String[] args){
        privateGetSet ab=new privateGetSet();
        ab.setId(71);
        System.out.println(ab.getId());
    }
}
*/