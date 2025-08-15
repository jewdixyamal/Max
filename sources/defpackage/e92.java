package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: e92  reason: default package */
public final class e92 implements Serializable {
    public final /* synthetic */ int a = 0;
    public final Serializable b;
    public final ArrayList c;

    public e92(qz7 qz7) {
        this.b = (String) qz7.b;
        this.c = (wz) qz7.c;
    }

    public static void e(mg4 mg4) {
        int ordinal = mg4.ordinal();
        if (ordinal != 0 && ordinal != 1) {
            throw new IllegalStateException("Unexpected value: " + mg4);
        }
    }

    public void a(d92 d92, mg4 mg4) {
        d(mg4).add(d92);
        e(mg4);
    }

    public e92 b(boolean z) {
        ArrayList arrayList = (ArrayList) this.b;
        List unmodifiableList = z ? Collections.unmodifiableList(arrayList) : new ArrayList(arrayList);
        ArrayList arrayList2 = this.c;
        return new e92(unmodifiableList, z ? Collections.unmodifiableList(arrayList2) : new ArrayList(arrayList2));
    }

    public int c(mg4 mg4) {
        return d(mg4).size();
    }

    public ArrayList d(mg4 mg4) {
        int ordinal = mg4.ordinal();
        if (ordinal == 0) {
            return (ArrayList) this.b;
        }
        if (ordinal == 1) {
            return this.c;
        }
        throw new IllegalStateException("Unexpected value: " + mg4);
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "Message{text='" + ((String) this.b) + "', attaches=" + ((wz) this.c) + "}";
            default:
                return super.toString();
        }
    }

    public e92() {
        this(new ArrayList(), new ArrayList());
    }

    public e92(List list, List list2) {
        this.b = new ArrayList(list);
        this.c = new ArrayList(list2);
    }
}
