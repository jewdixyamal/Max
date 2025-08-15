package defpackage;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.BufferedWriter;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* renamed from: ib7  reason: default package */
public final class ib7 implements ny9, xaf {
    public final boolean a = true;
    public final JsonWriter b;
    public final Map c;
    public final Map d;
    public final my9 e;
    public final boolean f;

    public ib7(BufferedWriter bufferedWriter, HashMap hashMap, HashMap hashMap2, ma7 ma7, boolean z) {
        this.b = new JsonWriter(bufferedWriter);
        this.c = hashMap;
        this.d = hashMap2;
        this.e = ma7;
        this.f = z;
    }

    public final ny9 a(kf5 kf5, Object obj) {
        g(obj, kf5.a);
        return this;
    }

    public final xaf b(String str) {
        h();
        this.b.value(str);
        return this;
    }

    public final xaf c(boolean z) {
        h();
        this.b.value(z);
        return this;
    }

    public final ny9 d(kf5 kf5, int i) {
        String str = kf5.a;
        h();
        JsonWriter jsonWriter = this.b;
        jsonWriter.name(str);
        h();
        jsonWriter.value((long) i);
        return this;
    }

    public final ny9 e(kf5 kf5, long j) {
        String str = kf5.a;
        h();
        JsonWriter jsonWriter = this.b;
        jsonWriter.name(str);
        h();
        jsonWriter.value(j);
        return this;
    }

    public final ib7 f(Object obj) {
        JsonWriter jsonWriter = this.b;
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        } else if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return this;
        } else if (obj.getClass().isArray()) {
            if (obj instanceof byte[]) {
                h();
                jsonWriter.value(Base64.encodeToString((byte[]) obj, 2));
                return this;
            }
            jsonWriter.beginArray();
            int i = 0;
            if (obj instanceof int[]) {
                int[] iArr = (int[]) obj;
                int length = iArr.length;
                while (i < length) {
                    jsonWriter.value((long) iArr[i]);
                    i++;
                }
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                int length2 = jArr.length;
                while (i < length2) {
                    long j = jArr[i];
                    h();
                    jsonWriter.value(j);
                    i++;
                }
            } else if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                int length3 = dArr.length;
                while (i < length3) {
                    jsonWriter.value(dArr[i]);
                    i++;
                }
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                int length4 = zArr.length;
                while (i < length4) {
                    jsonWriter.value(zArr[i]);
                    i++;
                }
            } else if (obj instanceof Number[]) {
                Number[] numberArr = (Number[]) obj;
                int length5 = numberArr.length;
                while (i < length5) {
                    f(numberArr[i]);
                    i++;
                }
            } else {
                Object[] objArr = (Object[]) obj;
                int length6 = objArr.length;
                while (i < length6) {
                    f(objArr[i]);
                    i++;
                }
            }
            jsonWriter.endArray();
            return this;
        } else if (obj instanceof Collection) {
            jsonWriter.beginArray();
            for (Object f2 : (Collection) obj) {
                f(f2);
            }
            jsonWriter.endArray();
            return this;
        } else if (obj instanceof Map) {
            jsonWriter.beginObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                try {
                    g(entry.getValue(), (String) key);
                } catch (ClassCastException e2) {
                    throw new RuntimeException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", new Object[]{key, key.getClass()}), e2);
                }
            }
            jsonWriter.endObject();
            return this;
        } else {
            my9 my9 = (my9) this.c.get(obj.getClass());
            if (my9 != null) {
                jsonWriter.beginObject();
                my9.a(obj, this);
                jsonWriter.endObject();
                return this;
            }
            waf waf = (waf) this.d.get(obj.getClass());
            if (waf != null) {
                waf.a(obj, this);
                return this;
            } else if (obj instanceof Enum) {
                String name = ((Enum) obj).name();
                h();
                jsonWriter.value(name);
                return this;
            } else {
                jsonWriter.beginObject();
                this.e.a(obj, this);
                jsonWriter.endObject();
                return this;
            }
        }
    }

    public final ib7 g(Object obj, String str) {
        boolean z = this.f;
        JsonWriter jsonWriter = this.b;
        if (z) {
            if (obj != null) {
                h();
                jsonWriter.name(str);
                f(obj);
            }
            return this;
        }
        h();
        jsonWriter.name(str);
        if (obj == null) {
            jsonWriter.nullValue();
        } else {
            f(obj);
        }
        return this;
    }

    public final void h() {
        if (!this.a) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
    }
}
