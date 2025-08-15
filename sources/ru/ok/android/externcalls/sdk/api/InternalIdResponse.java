package ru.ok.android.externcalls.sdk.api;

import java.io.IOException;
import ru.ok.android.api.json.JsonTypeMismatchException;

public class InternalIdResponse {
    public static final za7 PARSER = new ig5(25);
    public final String error;
    public final String name;
    public final long okId;

    public InternalIdResponse(long j, String str, String str2) {
        this.okId = j;
        this.name = str;
        this.error = str2;
    }

    public static InternalIdResponse parse(db7 db7) throws IOException, JsonTypeMismatchException {
        db7.s();
        long j = 0;
        String str = null;
        String str2 = null;
        while (db7.hasNext()) {
            String T = db7.T();
            T.getClass();
            char c = 65535;
            switch (T.hashCode()) {
                case 3373707:
                    if (T.equals("name")) {
                        c = 0;
                        break;
                    }
                    break;
                case 96784904:
                    if (T.equals("error")) {
                        c = 1;
                        break;
                    }
                    break;
                case 105793118:
                    if (T.equals("ok_id")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    str = db7.H();
                    break;
                case 1:
                    str2 = db7.H();
                    break;
                case 2:
                    j = db7.w();
                    break;
                default:
                    db7.z();
                    break;
            }
        }
        db7.q();
        return new InternalIdResponse(j, str, str2);
    }
}
