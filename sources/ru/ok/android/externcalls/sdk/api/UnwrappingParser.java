package ru.ok.android.externcalls.sdk.api;

import java.io.IOException;
import ru.ok.android.api.json.JsonParseException;

public final class UnwrappingParser<T> implements za7 {
    private final String fieldName;
    private final za7 valueParser;

    public UnwrappingParser(String str, za7 za7) {
        this.fieldName = str;
        this.valueParser = za7;
    }

    public T parse(db7 db7) throws IOException, JsonParseException {
        db7.s();
        T t = null;
        while (db7.hasNext()) {
            if (this.fieldName.equals(db7.T())) {
                t = this.valueParser.parse(db7);
            }
        }
        db7.q();
        if (t != null) {
            return t;
        }
        throw new Exception(zr6.l(new StringBuilder("\""), this.fieldName, "\" not found"));
    }
}
