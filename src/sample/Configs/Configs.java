package sample.Configs;

import java.util.regex.Pattern;

public class Configs {
    public static final String[] KEYWORDS = new String[] {
            "pelota", "caja", "piedra", "pluma","proyectil", "yunque", "bala","vehiculo",
            "suspendida", "moviendose", "cayendo", "rodando", "elevándose", "recorre", "dirigiéndose", "encontrar",
            "a", "y", "sobre", "en", "de", "que", "con","como","declarar",
            "velocidad","velocidadi","velocidadf", "altura", "densidad", "aceleración","distancia", "fuerza", "presión",
            "trabajo", "potencia", "longitud", "rapidez","masa", "tiempo", "área", "volumen",
            "metros", "kilogramos", "segundos", "m2","m3","m/s","m/s2","newton", "joule", "pascal","ohm","print"

    };

    public static final String KEYWORD_PATTERN = "\\b(" + String.join("|", KEYWORDS) + ")\\b";
    public static final String PAREN_PATTERN = "\\(|\\)";
    public static final String BRACE_PATTERN = "\\{|\\}";
    public static final String BRACKET_PATTERN = "\\[|\\]";
    public static final String SEMICOLON_PATTERN = "\\;";
    public static final String STRING_PATTERN = "\"([^\"\\\\]|\\\\.)*\"";
    public static final String COMMENT_PATTERN = "//[^\n]*" + "|" + "/\\*(.|\\R)*?\\*/";

    public static final Pattern PATTERN = Pattern.compile(
            "(?<KEYWORD>" + KEYWORD_PATTERN + ")"
                    + "|(?<PAREN>" + PAREN_PATTERN + ")"
                    + "|(?<BRACE>" + BRACE_PATTERN + ")"
                    + "|(?<BRACKET>" + BRACKET_PATTERN + ")"
                    + "|(?<SEMICOLON>" + SEMICOLON_PATTERN + ")"
                    + "|(?<STRING>" + STRING_PATTERN + ")"
                    + "|(?<COMMENT>" + COMMENT_PATTERN + ")"
    );

    public static final String sampleCode = String.join("\n", new String[] {
          "print(10)"



    });
    public static String[] expresiones={
            "delarar [a-z]{1,} como pelota",
            "encontrar velocidadi de [a-z]{1,} cayendo con masa de [1-9]{1,} kilogramos en tiempo de [1-9]{1,} segundos con velocidadf de [1-9]{1,} m/s",
            "encontrar masa de [a-z]{1,} cayendo con velocidadi de [1-9]{1,} m/s con velocidadf de [1-9]{1,} m/s en tiempo de [1-9]{1,} segundos",
            "encontrar tiempo de [a-z]{1,} cayendo con velocidadi de [1-9]{1,} m/s con velocidadf de [1-9]{1,} m/s con masa de [1-9]{1,}  kilogramos",
            "encontrar velocidadf de [a-z]{1,} cayendo con masa de [1-9]{1,}  kilogramos con velocidadi de [1-9]{1,} m/s en tiempo de [1-9]{1,} segundos ",
            "encontrar tiempo de [a-z]{1,} que recorre [1-9]{1,} metros con velocidadi de [1-9]{1,} m/s con velocidadf de [1-9]{1,} m/s",
            "encontrar distancia de [a-z]{1,} con tiempo de [1-9]{1,} segundos con velocidadi de [1-9]{1,} m/s con velocidadf de [1-9]{1,} m/s",
            "encontrar velocidadi de [a-z]{1,} con tiempo de [1-9]{1,} segundos con velocidadf de [1-9]{1,} m/s que recorre [1-9]{1,} metros",
            "encontrar velocidadf de [a-z]{1,} con tiempo de [1-9]{1,} segundos con velocidadi de [1-9]{1,} m/s que recorre [1-9]{1,} metros",
            "encontrar velocidad de [a-z]{1,} moviendose con distancia de [1-9]{1,} metros en tiempo de [1-9]{1,} segundos",
            "encontrar distancia de [a-z]{1,} moviendose con velocidad de [1-9]{1,} m/s en tiempo de [1-9]{1,} segundos",
            "print[(][a-z0-9]{1,}[)]"
    };
}
