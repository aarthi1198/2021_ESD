/* Java program that reads via CLA (size type) example: 1 KB / 1 MB, calculate the memory in bytes */

class MemoryinBytes{
 
	public static void main(String[] args) {
	
		double size_kilobytes = Double.parseDouble(args[0]);
		double size_megabytes = Double.parseDouble(args[0]);
		
		double size_kb_to_b = size_kilobytes * 1024;
		double size_mb_to_b = size_kilobytes * 1024 * 1024;
		
        System.out.println("\nMemory Size :\n");
		System.out.println(size_kilobytes + " KiloBytes (KB) = " + size_kb_to_b + " Bytes (B)");	
        System.out.println(size_megabytes + " MegaBytes (MB) = " + size_mb_to_b + " Bytes (B)");		 
	}
}		
		
	   