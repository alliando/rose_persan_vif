package edu.isep.speakisep;

public  class Relative_ROOT {
    private Class myClass = getClass();
    public String imagePath = getBASE_ROOT();



    private String getLoaderRessource() {
        try {
            ClassLoader loader = myClass.getClassLoader();
            imagePath = loader.getResource("").getPath();

        } catch (Exception e) {

        }
        return imagePath;
    }

    private String dispatcher(String path) {
        int len = path.lastIndexOf("rose_persan_vif");
        path = path.substring(0, len);
        return path + "rose_persan_vif/";

    }

    private String getBASE_ROOT() {
        String aa=getLoaderRessource();
        return  dispatcher(aa);
    }

    public String addRoot(String path){
        String absolutePath=this.imagePath+path;
    return absolutePath;}

}
