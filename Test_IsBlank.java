class Test_IsBlank {
    public static void main(String[] args) {
        
        String s = "SRj";

        System.out.println(s.isBlank()+" "+s.isEmpty());
        System.out.println(s.isBlank()==s.isEmpty());

    }
}