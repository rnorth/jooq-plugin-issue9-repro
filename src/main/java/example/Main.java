package example;

import example.domain.tables.Things;
import example.domain.tables.records.ThingsRecord;
import org.jooq.DSLContext;

public class Main {

    public static void main(String[] args) {
        DSLContext dsl = null; // we don't care about this actually running, just compiling

        ThingsRecord record = dsl.newRecord(Things.THINGS);
        record.insert();
    }
}
