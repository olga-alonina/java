package Homework_April_19;

public class FlightTicket {
    private String type, dep_Loc, arr_Loc;

    public FlightTicket(String type, String dep_Loc, String arr_Loc) {
        setType( type );
        setDep_Loc( dep_Loc );
        setArr_Loc( arr_Loc );
    }

    public void setDep_Loc(String dep_Loc) {
        this.dep_Loc = dep_Loc;
    }

    public void setArr_Loc(String arr_Loc) {
        this.arr_Loc = arr_Loc;
    }

    public void setType(String type) {
        if (type.equalsIgnoreCase( "first" )
                || type.equalsIgnoreCase( "business" ) ||
                type.equalsIgnoreCase( "economy" )) {
            this.type = type;
        }
    }

    @Override
    public String toString() {
        return "FlightTicket{" +
                "type='" + type + '\'' +
                ", dep_Loc='" + dep_Loc + '\'' +
                ", arr_Loc='" + arr_Loc + '\'' +
                '}';
    }
}
