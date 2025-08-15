package defpackage;

import kotlin.coroutines.Continuation;
import one.me.messages.list.ui.MessagesListWidget;
import one.me.pinbars.PinBarsWidget;
import ru.ok.tamtam.nano.Protos;

/* renamed from: ap8  reason: default package */
public final class ap8 implements mn5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mn5 b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ap8(mn5 mn5, Object obj, int i) {
        this.a = i;
        this.b = mn5;
        this.c = obj;
    }

    public final Object d(on5 on5, Continuation continuation) {
        switch (this.a) {
            case 0:
                Object d = this.b.d(new zb(on5, 28, (bp8) this.c), continuation);
                return d == tx3.a ? d : e5f.a;
            case 1:
                Object d2 = this.b.d(new o69(on5, 0, (MessagesListWidget) this.c), continuation);
                return d2 == tx3.a ? d2 : e5f.a;
            case 2:
                Object d3 = this.b.d(new o69(on5, 1, (hyc) this.c), continuation);
                return d3 == tx3.a ? d3 : e5f.a;
            case 3:
                Object d4 = this.b.d(new o69(on5, 2, (dza) this.c), continuation);
                return d4 == tx3.a ? d4 : e5f.a;
            case 4:
                Object d5 = this.b.d(new o69(on5, 3, (pza) this.c), continuation);
                return d5 == tx3.a ? d5 : e5f.a;
            case 5:
                Object d6 = this.b.d(new o69(on5, 4, (PinBarsWidget) this.c), continuation);
                return d6 == tx3.a ? d6 : e5f.a;
            case 6:
                Object d7 = this.b.d(new o69(on5, 5, (o23) this.c), continuation);
                return d7 == tx3.a ? d7 : e5f.a;
            case 7:
                Object d8 = this.b.d(new o69(on5, 6, (feb) this.c), continuation);
                return d8 == tx3.a ? d8 : e5f.a;
            case 8:
                Object d9 = this.b.d(new o69(on5, 8, (vvc) this.c), continuation);
                return d9 == tx3.a ? d9 : e5f.a;
            case 9:
                Object d10 = this.b.d(new o69(on5, 9, (vid) this.c), continuation);
                return d10 == tx3.a ? d10 : e5f.a;
            case 10:
                Object d11 = this.b.d(new o69(on5, 10, (bod) this.c), continuation);
                return d11 == tx3.a ? d11 : e5f.a;
            case 11:
                Object d12 = this.b.d(new o69(on5, 11, (ltd) this.c), continuation);
                return d12 == tx3.a ? d12 : e5f.a;
            case Protos.Attaches.Attach.PRESENT /*12*/:
                Object d13 = this.b.d(new o69(on5, 13, (b6e) this.c), continuation);
                return d13 == tx3.a ? d13 : e5f.a;
            case 13:
                Object d14 = this.b.d(new o69(on5, 14, (a8e) this.c), continuation);
                return d14 == tx3.a ? d14 : e5f.a;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                Object d15 = this.b.d(new o69(on5, 15, (v6f) this.c), continuation);
                return d15 == tx3.a ? d15 : e5f.a;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                Object d16 = this.b.d(new o69(on5, 16, (vqe) this.c), continuation);
                return d16 == tx3.a ? d16 : e5f.a;
            default:
                Object d17 = this.b.d(new o69(on5, 17, (mif) this.c), continuation);
                return d17 == tx3.a ? d17 : e5f.a;
        }
    }
}
