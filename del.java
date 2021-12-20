import java.io.*;

class del{
 static int count,totalcount;
 public static void main(String args[]){
  File file= new File("");
  recurse(file);
  
  System.out.println(totalcount+" directories found, "+count+" empty directories deleted.");
 }

 public static void recurse(File file){
  totalcount++;

  if(file.isDirectory())
  {
   File[] filelist=file.listFiles();

   if(filelist.length==0)
   {
    file.delete();
    count++;
    return;
   }
   
   for(File newfile:filelist)
   recurse(newfile);

   return;
  }
 }
}