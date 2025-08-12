package coderiverside.strings;

public class TextBlocks {
    public static void main(String[] args) {
        String html = "<html>\n" +
                "    <body>\n" +
                "        <p>Hello, world</p>\n" +
                "    </body>\n" +
                "</html>\n";
        System.out.println(html);

        html = """
                   <html>
                        <body>
                            <p>Hello, world</p>
                        </body>
                   </html>
                    """;
        System.out.println(html);

        String tb = """
                    """;
        System.out.println("tb = " + tb);

        String u = """
                abc \
                def
                """;
        System.out.println("u = " + u);


//        String x = """""";
//        String y = """ """;
//        String z = """
//                ";
//
//        String w = """
//                abc \ x
//                def
//                """;


    }
}
