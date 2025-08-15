package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: rec  reason: default package */
public final class rec extends LinkedHashMap {
    public final /* synthetic */ sh0 a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rec(sh0 sh0, int i) {
        super(i, 0.75f, true);
        this.a = sh0;
    }

    public final boolean removeEldestEntry(Map.Entry entry) {
        return size() > this.a.b;
    }
}
