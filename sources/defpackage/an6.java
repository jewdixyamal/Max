package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: an6  reason: default package */
public abstract class an6 implements ok5 {
    public final String a;
    public final List b;
    public final boolean c;

    public an6(String str, boolean z, List list) {
        this.a = str;
        this.b = Collections.unmodifiableList(list);
        this.c = z;
    }
}
