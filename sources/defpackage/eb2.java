package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.nano.Protos;

/* renamed from: eb2  reason: default package */
public final class eb2 extends ffe implements a66 {
    public final /* synthetic */ zb2 X;
    public final /* synthetic */ String Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public eb2(zb2 zb2, String str, Continuation continuation) {
        super(2, continuation);
        this.X = zb2;
        this.Y = str;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((eb2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new eb2(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        nkc nkc;
        List list;
        od2.a0(obj);
        String str = zb2.K0;
        zb2 zb2 = this.X;
        alc e = zb2.e();
        e.getClass();
        xlc a = xlc.a(1, "SELECT * FROM chat_folder WHERE id = ?");
        String str2 = this.Y;
        if (str2 == null) {
            a.W(1);
        } else {
            a.f(1, str2);
        }
        ilc ilc = e.a;
        ilc.b();
        Cursor o = ilc.o(a, (CancellationSignal) null);
        try {
            int n = tfg.n(o, "id");
            int n2 = tfg.n(o, "title");
            int n3 = tfg.n(o, "emoji");
            int n4 = tfg.n(o, "order");
            int n5 = tfg.n(o, "filters");
            int n6 = tfg.n(o, "isHiddenForAllFolder");
            int n7 = tfg.n(o, "hideIfEmpty");
            int n8 = tfg.n(o, "elements");
            int n9 = tfg.n(o, "creatorId");
            int n10 = tfg.n(o, "filterSubjects");
            int n11 = tfg.n(o, "widgets");
            int n12 = tfg.n(o, "options");
            String str3 = str2;
            int n13 = tfg.n(o, "isRemoved");
            if (o.moveToFirst()) {
                String string = o.isNull(n) ? null : o.getString(n);
                String string2 = o.isNull(n2) ? null : o.getString(n2);
                String string3 = o.isNull(n3) ? null : o.getString(n3);
                int i = o.getInt(n4);
                EnumSet I = dy7.I(o.isNull(n5) ? null : o.getString(n5));
                boolean z = o.getInt(n6) != 0;
                boolean z2 = o.getInt(n7) != 0;
                byte[] blob = o.isNull(n8) ? null : o.getBlob(n8);
                if (blob != null) {
                    Protos.MessageElements messageElements = new Protos.MessageElements();
                    qw8.mergeFrom(messageElements, blob);
                    list = ou8.a(messageElements.elements);
                } else {
                    list = nz4.a;
                }
                nkc = new nkc(string, string2, string3, i, (Set) I, z, z2, list, o.isNull(n9) ? null : Long.valueOf(o.getLong(n9)), dy7.q(o.isNull(n10) ? null : o.getBlob(n10)), dy7.s(o.isNull(n11) ? null : o.getBlob(n11)), dy7.r(o.isNull(n12) ? null : o.getBlob(n12)), o.getInt(n13) != 0);
            } else {
                nkc = null;
            }
            if (nkc == null) {
                return null;
            }
            ArrayList e2 = zb2.e().e(str3);
            wz4 wz4 = wz4.a;
            return nkc.a(e2, wz4, wz4, (hda) zb2.o.getValue());
        } finally {
            o.close();
            a.n();
        }
    }
}
