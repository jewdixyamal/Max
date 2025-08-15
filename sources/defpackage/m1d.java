package defpackage;

import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.startconversation.StartConversationScreen;

/* renamed from: m1d  reason: default package */
public final class m1d extends ffe implements c66 {
    public final /* synthetic */ int X;
    public /* synthetic */ Object Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ Object s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m1d(c86 c86, e4d e4d, Continuation continuation) {
        super(3, continuation);
        this.X = 1;
        this.Z = c86;
        this.s0 = e4d;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.X) {
            case 0:
                m1d m1d = new m1d((Object) (mib) this.s0, (Continuation) obj3, 0);
                m1d.Z = (TextView) obj;
                m1d.Y = (fka) obj2;
                e5f e5f = e5f.a;
                m1d.o(e5f);
                return e5f;
            case 1:
                AppCompatTextView appCompatTextView = (AppCompatTextView) obj;
                m1d m1d2 = new m1d((c86) this.Z, (e4d) this.s0, (Continuation) obj3);
                m1d2.Y = (fka) obj2;
                e5f e5f2 = e5f.a;
                m1d2.o(e5f2);
                return e5f2;
            case 2:
                m1d m1d3 = new m1d((Object) (ltd) this.s0, (Continuation) obj3, 2);
                m1d3.Z = (e52) obj;
                m1d3.Y = (uj3) obj2;
                return m1d3.o(e5f.a);
            case 3:
                m1d m1d4 = new m1d((Object) (StartConversationScreen) this.s0, (Continuation) obj3, 3);
                m1d4.Z = (dn3) obj;
                m1d4.Y = (List) obj2;
                e5f e5f3 = e5f.a;
                m1d4.o(e5f3);
                return e5f3;
            default:
                m1d m1d5 = new m1d((Object) (wka) ((yka) this.s0), (Continuation) obj3, 4);
                m1d5.Z = (ImageView) obj;
                m1d5.Y = (fka) obj2;
                e5f e5f4 = e5f.a;
                m1d5.o(e5f4);
                return e5f4;
        }
    }

    public final Object o(Object obj) {
        CharSequence m0;
        e5f e5f = e5f.a;
        Object obj2 = this.s0;
        switch (this.X) {
            case 0:
                od2.a0(obj);
                ((TextView) this.Z).setTextColor(((Number) ((mib) obj2).b.invoke((fka) this.Y)).intValue());
                return e5f;
            case 1:
                od2.a0(obj);
                fka fka = (fka) this.Y;
                ((e4d) obj2).H0.setTextColor(((c86) this.Z).c ? fka.getText().j : fka.getText().h);
                return e5f;
            case 2:
                od2.a0(obj);
                e52 e52 = (e52) this.Z;
                uj3 uj3 = (uj3) this.Y;
                qk5 a0 = l6d.a0(new at(2, e52.j()), new w8c(8));
                ltd ltd = (ltd) obj2;
                ltd.getClass();
                List i0 = l6d.i0(l6d.Z(a0, new k5d((Object) ltd, 3, (Object) e52)));
                if (!e52.e0()) {
                    return i0;
                }
                kl7 l = j1e.l();
                l.add(uj3);
                l.addAll(i0);
                return j1e.d(l);
            case 3:
                od2.a0(obj);
                dn3 dn3 = (dn3) this.Z;
                List list = (List) this.Y;
                bc7[] bc7Arr = StartConversationScreen.I0;
                StartConversationScreen startConversationScreen = (StartConversationScreen) obj2;
                CharSequence m02 = startConversationScreen.m0();
                if (!(!(m02 == null || m02.length() == 0))) {
                    startConversationScreen.A0.E(dn3.a);
                    nz4 nz4 = nz4.a;
                    startConversationScreen.B0.E(nz4);
                    startConversationScreen.C0.E(dn3.c);
                    a3g a3g = startConversationScreen.D0;
                    if (a3g.j() == 0 && ((m0 = startConversationScreen.m0()) == null || m0.length() == 0)) {
                        a3g.E(wmd.n());
                    }
                    dn3 dn32 = dn3.d;
                    a3g a3g2 = startConversationScreen.z0;
                    if (dn3 == dn32) {
                        a3g2.E(nz4);
                    } else {
                        a3g2.E(list);
                    }
                }
                return e5f;
            default:
                od2.a0(obj);
                ((ImageView) this.Z).setColorFilter(((fka) this.Y).c(((wka) ((yka) obj2)).d));
                return e5f;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m1d(Object obj, Continuation continuation, int i) {
        super(3, continuation);
        this.X = i;
        this.s0 = obj;
    }
}
