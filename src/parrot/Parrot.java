package parrot;
/*
•Hur väljs var logik hamnar i koden?
Om vi med logik menar funktionalitet/beteende av koden så bör man ha OOP principer i åtanke.
Logik placeras bäst där den matchar klassens eller objektets ansvar.
Varje klass eller metod bör ha en enda typ av ansvar som är lätt att definiera(kan väl böja denna regel lite för klasser).
Inkapsling, logiken bör kapslas in i klasser tillsammans med tillståd och metoder. Minskar beroende av externa faktorer.
Logik som återanvänds mycket bör möjligen brytas ut till en egen metod för att undvika obödig upprepning.
•Vilka poänger finns med arv?
Återanvändning av kod, genom att skapa en bas klass kan man återanvända metoder och datafält i subklasser utan att upprepa kod.
Arv underlättar möjligheten att utöka funktionaliteten i en klass.
Arv möjliggör en tydlig struktur "är en/ett" förhållande mellan klasser.
Polymorfism, man kan använda en referens till en basklass för att hålla ett objekt av en subbklass och anropa metoder som överskuggas.
•Vad är största skillnaden mellan gränssnitt och arv?
ARV:
I Java finns bara arv från en annan klass (från flera i t.ex python). Genom arv kan klasser ärva implementationer av metoder.
Subklasser kan överskugga metoder.
GRÄNSSNITT:
En klass kan implementera flera gränssnitt. Ett gränssnitt har endast metodsdeklarationer ingen implementering. Kan ses som en blueprint kanske.
Default metoder är möjliga, även funktionella interfaces. Men interfaces har inga datafält.
En klass som implementerar ett interface måste implementera alla metoder som inte är default metoder som redan är implementerade.
•Vad avgör om arv eller gränssnitt är rätt val?
Föreligger en tydlig "är en/ett" relation är arv lämpligt. Även lämpligt då man vill återanvända implementerad kod.
Om man vill ha ett gemensamt beteende mellan klasser(ex Comperable klasser) så är interfaces bra. Om man behöver flera typer av beteende (p.g.a.
avsaknad av multipelt arv) så är interfaces nödvändiga. Om man önskar en lösar koppling mellan implementation och typen, lättare med nya klasser 
i framtiden då."

 */

public class Parrot {

    private ParrotTypeEnum type;
    private int numberOfCoconuts;
    private double voltage;
    private boolean isNailed;

    public Parrot(ParrotTypeEnum type, int numberOfCoconuts, double voltage, boolean isNailed) {
        this.type = type;
        this.numberOfCoconuts = numberOfCoconuts;
        this.voltage = voltage;
        this.isNailed = isNailed;
    }

    public double getSpeed() {
        return switch (type) {
            case EUROPEAN -> getBaseSpeed();
            case AFRICAN -> Math.max(0, getBaseSpeed() - getLoadFactor() * numberOfCoconuts);
            case NORWEGIAN_BLUE -> (isNailed) ? 0 : getBaseSpeed(voltage);
            default -> throw new RuntimeException("Should be unreachable");
        };
    }
    
    public String getHabitation() {
    	return switch (type) {
    	case EUROPEAN -> "In a nest made of sticks.";
    	case AFRICAN -> "In holes in trees.";
    	case NORWEGIAN_BLUE -> (isNailed) ? "In cages." : "Nowhere.";
    	default -> throw new RuntimeException("This should not happen.");
    	};
    } 

    private double getBaseSpeed(double voltage) {
        return Math.min(24.0, voltage * getBaseSpeed());
    }

    private double getLoadFactor() {
        return 9.0;
    }

    private double getBaseSpeed() {
        return 12.0;
    }

}
