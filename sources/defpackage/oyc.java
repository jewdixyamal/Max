package defpackage;

import android.content.Context;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: oyc  reason: default package */
public abstract class oyc extends e3 {
    public final qyc h;

    public oyc(Context context, mi5 mi5, qyc qyc) {
        super(context, "features_prefs", mi5);
        this.h = qyc;
    }

    public final boolean n(PmsKey pmsKey, boolean z) {
        Boolean bool;
        Boolean valueOf = Boolean.valueOf(z);
        boolean contains = this.g.contains(pmsKey.name());
        this = this;
        if (!contains) {
            this = this.h;
        }
        Class<Boolean> cls = Boolean.class;
        h23 a = nec.a(cls);
        if (a.equals(nec.a(Boolean.TYPE))) {
            bool = Boolean.valueOf(this.d(pmsKey.name(), z));
        } else if (a.equals(nec.a(Long.TYPE))) {
            bool = (Boolean) Long.valueOf(this.g.getLong(pmsKey.name(), ((Long) valueOf).longValue()));
        } else if (a.equals(nec.a(String.class))) {
            String string = this.g.getString(pmsKey.name(), (String) valueOf);
            if (string != null) {
                bool = (Boolean) string;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
            }
        } else {
            h23 a2 = nec.a(cls);
            throw new IllegalArgumentException("Unsupported type: " + a2);
        }
        return bool.booleanValue();
    }

    public final long o(PmsKey pmsKey, long j) {
        Long l;
        Long valueOf = Long.valueOf(j);
        boolean contains = this.g.contains(pmsKey.name());
        this = this;
        if (!contains) {
            this = this.h;
        }
        Class<Long> cls = Long.class;
        h23 a = nec.a(cls);
        if (a.equals(nec.a(Boolean.TYPE))) {
            l = (Long) Boolean.valueOf(this.d(pmsKey.name(), ((Boolean) valueOf).booleanValue()));
        } else if (a.equals(nec.a(Long.TYPE))) {
            l = Long.valueOf(this.g.getLong(pmsKey.name(), j));
        } else if (a.equals(nec.a(String.class))) {
            String string = this.g.getString(pmsKey.name(), (String) valueOf);
            if (string != null) {
                l = (Long) string;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
            }
        } else {
            h23 a2 = nec.a(cls);
            throw new IllegalArgumentException("Unsupported type: " + a2);
        }
        return l.longValue();
    }
}
