package defpackage;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.BufferedReader;
import java.io.IOException;

/* renamed from: za0  reason: default package */
public final class za0 {
    public final long a;

    public za0(long j) {
        this.a = j;
    }

    public static za0 a(BufferedReader bufferedReader) {
        JsonReader jsonReader = new JsonReader(bufferedReader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (!jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    jsonReader.skipValue();
                } else if (jsonReader.peek() == JsonToken.STRING) {
                    return new za0(Long.parseLong(jsonReader.nextString()));
                } else {
                    za0 za0 = new za0(jsonReader.nextLong());
                    jsonReader.close();
                    return za0;
                }
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } finally {
            jsonReader.close();
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof za0)) {
            return false;
        }
        return this.a == ((za0) obj).a;
    }

    public final int hashCode() {
        long j = this.a;
        return ((int) ((j >>> 32) ^ j)) ^ 1000003;
    }

    public final String toString() {
        return zr6.k(new StringBuilder("LogResponse{nextRequestWaitMillis="), this.a, "}");
    }
}
