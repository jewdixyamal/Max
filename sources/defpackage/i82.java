package defpackage;

import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* renamed from: i82  reason: default package */
public final /* synthetic */ class i82 implements f6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i82(hd5 hd5) {
        this.a = 3;
        this.c = hd5;
        this.b = 0;
    }

    public final void run() {
        long j = this.b;
        Object obj = this.c;
        switch (this.a) {
            case 0:
                p82 p82 = (p82) obj;
                p82.e();
                p82.f0("localRemoveChat", new r60(p82, j, 3));
                elc elc = ((k24) ((c34) p82.l.get())).b;
                elc.getClass();
                ((OneMeRoomDatabase) elc.a.m()).p(new dlc(0, new clc(elc, j, 1)));
                au8 au8 = (au8) p82.s.get();
                au8.getClass();
                hm9.m("au8", "deleteMessages %d, all!", new Object[0]);
                ((k24) au8.a).c.d().e(j);
                return;
            case 1:
                el3 el3 = (el3) obj;
                el3.c(j, new c10(((p7b) el3.h).a.n(), 11));
                return;
            case 2:
                ((k4a) ((dd5) obj).a).g(5, j);
                return;
            default:
                ((k4a) ((hd5) obj).a).g(4, j);
                return;
        }
    }

    public /* synthetic */ i82(Object obj, long j, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }
}
