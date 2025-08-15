package defpackage;

import java.util.AbstractCollection;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: rp3  reason: default package */
public final class rp3 extends pi0 {
    public final /* synthetic */ int b = 1;
    public final AbstractCollection c;

    public rp3(long j, wz wzVar) {
        super(j);
        this.c = wzVar;
    }

    public final String toString() {
        switch (this.b) {
            case 0:
                return "ContactNotFoundEvent{contactServerIds=" + ((LinkedHashSet) this.c) + '}';
            default:
                return "SharePreviewEvent{attaches=" + ((wz) this.c) + '}';
        }
    }

    public rp3(List list) {
        this.c = new LinkedHashSet(list);
    }
}
