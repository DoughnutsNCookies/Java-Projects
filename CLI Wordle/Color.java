public class Color {
	
	/* Regular */
	public static final String BLACK 		= "\033[0;30m";
	public static final String RED 			= "\033[0;31m";
	public static final String GREEN 		= "\033[0;32m";
	public static final String YELLOW 		= "\033[0;33m";
	public static final String BLUE 		= "\033[0;34m";
	public static final String MAGENTA 		= "\033[0;35m";
	public static final String CYAN 		= "\033[0;36m";
	public static final String WHITE 		= "\033[0;37m";

	/* Bolded */
	public static final String BBLACK 		= "\033[1;30m";
	public static final String BRED 		= "\033[1;31m";
	public static final String BGREEN 		= "\033[1;32m";
	public static final String BYELLOW 		= "\033[1;33m";
	public static final String BBLUE 		= "\033[1;34m";
	public static final String BMAGEN		= "\033[1;35m";
	public static final String BCYAN 		= "\033[1;36m";
	public static final String BWHITE 		= "\033[1;37m";

	/* Underlined */
	public static final String UBLACK 		= "\033[4;30m";
	public static final String URED 		= "\033[4;31m";
	public static final String UGREEN 		= "\033[4;32m";
	public static final String UYELLOW 		= "\033[4;33m";
	public static final String UBLUE 		= "\033[4;34m";
	public static final String UMAGEN		= "\033[4;35m";
	public static final String UCYAN 		= "\033[4;36m";
	public static final String UWHITE 		= "\033[4;37m";

	/* Background */
	public static final String BLACKB 		= "\033[40m";
	public static final String REDB 		= "\033[41m";
	public static final String GREENB 		= "\033[42m";
	public static final String YELLOWB 		= "\033[43m";
	public static final String BLUEB 		= "\033[44m";
	public static final String MAGENTB		= "\033[45m";
	public static final String CYANB 		= "\033[46m";
	public static final String WHITEB 		= "\033[47m";

	/* High Intensity Background */
	public static final String BLACKHB 		= "\033[0;100m";
	public static final String REDHB 		= "\033[0;101m";
	public static final String GREENHB 		= "\033[0;102m";
	public static final String YELLOWHB		= "\033[0;103m";
	public static final String BLUEHB 		= "\033[0;104m";
	public static final String MAGENTAHB	= "\033[0;105m";
	public static final String CYANHB 		= "\033[0;106m";
	public static final String WHITEHB 		= "\033[0;107m";

	/* High Intensity Text */
	public static final String HBLACK 		= "\033[0;90m";
	public static final String HRED 		= "\033[0;91m";
	public static final String HGREEN 		= "\033[0;92m";
	public static final String HYELLOW 		= "\033[0;93m";
	public static final String HBLUE 		= "\033[0;94m";
	public static final String HMAGEN		= "\033[0;95m";
	public static final String HCYAN 		= "\033[0;96m";
	public static final String HWHITE 		= "\033[0;97m";

	/* Bolded High Intensity Text */
	public static final String BHBLACK 		= "\033[1;90m";
	public static final String BHRED 		= "\033[1;91m";
	public static final String BHGREEN 		= "\033[1;92m";
	public static final String BHYELL		= "\033[1;93m";
	public static final String BHBLUE 		= "\033[1;94m";
	public static final String BHMAGEN		= "\033[1;95m";
	public static final String BHCYAN 		= "\033[1;96m";
	public static final String BHWHITE 		= "\033[1;97m";

	/* Misc */
	public static final String RESET		= "\033[0m";
	public static final String CLR_TERM		= "\033[H\033[2J";
}
