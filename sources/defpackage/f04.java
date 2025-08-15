package defpackage;

import android.database.ContentObserver;
import android.database.Cursor;
import android.os.Handler;

/* renamed from: f04  reason: default package */
public final class f04 extends ContentObserver {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f04(jva jva, Handler handler) {
        super(handler);
        this.b = jva;
    }

    public boolean deliverSelfNotifications() {
        switch (this.a) {
            case 0:
                return true;
            case 2:
                return false;
            default:
                return super.deliverSelfNotifications();
        }
    }

    public final void onChange(boolean z) {
        Cursor cursor;
        Object value;
        switch (this.a) {
            case 0:
                h04 h04 = (h04) this.b;
                if (h04.b && (cursor = h04.c) != null && !cursor.isClosed()) {
                    h04.a = h04.c.requery();
                    return;
                }
                return;
            case 1:
                hm9.m(fz6.E0, "ContentObserver: on content changed", new Object[0]);
                ((fz6) this.b).e();
                return;
            default:
                hm9.m("Phonebook", "contact observer onChange", new Object[0]);
                jva jva = (jva) this.b;
                q0e q0e = jva.t0;
                do {
                    value = q0e.getValue();
                    ((Number) value).intValue();
                } while (!q0e.c(value, Integer.valueOf(jva.s0.incrementAndGet())));
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f04(h04 h04) {
        super(new Handler());
        this.b = h04;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f04(fz6 fz6) {
        super((Handler) null);
        this.b = fz6;
    }
}
