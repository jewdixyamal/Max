package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: db2  reason: default package */
public final class db2 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ zb2 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public db2(zb2 zb2, Continuation continuation) {
        super(2, continuation);
        this.Y = zb2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((db2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new db2(this.Y, continuation);
    }

    /* JADX INFO: finally extract failed */
    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            zb2 zb2 = this.Y;
            String str = zb2.K0;
            alc e = zb2.e();
            this.X = 1;
            e.getClass();
            obj = ote.i(e.a, new CancellationSignal(), new ykc(e, xlc.a(0, "SELECT * FROM chat_folder WHERE isHiddenForAllFolder = 1"), 2), this);
            if (obj == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        xs xsVar = new xs(0);
        EnumSet<E> noneOf = EnumSet.noneOf(pa2.class);
        zb2 zb22 = this.Y;
        for (nkc nkc : (List) obj) {
            String str2 = zb2.K0;
            alc e2 = zb22.e();
            String str3 = nkc.a;
            e2.getClass();
            xlc a = xlc.a(1, "SELECT chatId FROM folder_and_chats WHERE folderId = ?");
            if (str3 == null) {
                a.W(1);
            } else {
                a.f(1, str3);
            }
            ilc ilc = e2.a;
            ilc.b();
            Cursor o = ilc.o(a, (CancellationSignal) null);
            try {
                ArrayList arrayList = new ArrayList(o.getCount());
                while (o.moveToNext()) {
                    arrayList.add(o.isNull(0) ? null : Long.valueOf(o.getLong(0)));
                }
                o.close();
                a.n();
                xsVar.addAll(arrayList);
                noneOf.addAll(nkc.e);
            } catch (Throwable th) {
                o.close();
                a.n();
                throw th;
            }
        }
        at5 a2 = ((nkc) this.Y.B0.getValue()).a(nz4.a, xsVar, noneOf, (hda) this.Y.o.getValue());
        this.Y.D0 = a2;
        this.Y.t0.put("all.chat.folder", a2);
        return a2;
    }
}
