import java.io.*;
import java.util.*;

class filedata{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the name of the file:");
		String file_name = input.nextLine();
		File f = new File(file_name);
		int nchars=0,nlines=0,nwords=0;
		if(f.exists()) 
			System.out.println("The file " +file_name+ " exists");
		else
			System.out.println("The file " +file_name+ " does not exist");
		if(f.exists()){
			if(f.canRead())
				System.out.println("The file " +file_name+ " is readable");
			else
				System.out.println("The file " +file_name+ " is not readable");
			if(f.canWrite())
				System.out.println("The file " +file_name+ " is writeable");
			else
				System.out.println("The file " +file_name+ " is not writeable");
			System.out.println("The file type is " +file_name.substring(file_name.indexOf('.')+1));
			System.out.println("The Length of the file " +f.length());
			}
		try{
			FileInputStream fs = new FileInputStream(f);
			InputStreamReader isr = new InputStreamReader(fs);
			Reader r = new BufferedReader(isr);
			StreamTokenizer st = new StreamTokenizer(r);
			st.eolIsSignificant(true);
			while(st.nextToken()!=StreamTokenizer.TT_EOF){
				switch(st.ttype){
				case StreamTokenizer.TT_EOL:
					nlines++;
					nchars++;
					break;
				case StreamTokenizer.TT_WORD:
					nwords++;
				default:
					if(st.ttype==StreamTokenizer.TT_WORD)
						nchars+=st.sval.length();
					break;
					}
				}
			} catch(FileNotFoundException e){
				System.out.println("File was not found");
				}catch(IOException e){
					System.out.println("Error occured reading file:");
				}
			System.out.println("The no of charecters are " +nchars);
			System.out.println("The no of words are " +nwords);
			System.out.println("The no of lines are " +nlines);
			}
	}