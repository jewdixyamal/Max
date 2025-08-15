package defpackage;

import android.content.Context;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: zmd  reason: default package */
public final class zmd extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ and Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zmd(and and, Continuation continuation) {
        super(2, continuation);
        this.Z = and;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((zmd) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        zmd zmd = new zmd(this.Z, continuation);
        zmd.Y = obj;
        return zmd;
    }

    public final Object o(Object obj) {
        sx3 sx3;
        tx3 tx3 = tx3.a;
        int i = this.X;
        e5f e5f = e5f.a;
        and and = this.Z;
        if (i == 0) {
            od2.a0(obj);
            sx3 sx32 = (sx3) this.Y;
            if (((f5a) and.b.getValue()).d() && j1e.z(sx32)) {
                this.Y = sx32;
                this.X = 1;
                Object k = j1e.k(new xmd(and, (Continuation) null), this);
                if (k == tx3) {
                    return tx3;
                }
                sx3 sx33 = sx32;
                obj = k;
                sx3 = sx33;
            }
            return e5f;
        } else if (i == 1) {
            sx3 = (sx3) this.Y;
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        List<umd> list = (List) obj;
        j1e.o(sx3);
        if (!list.isEmpty()) {
            Context context = and.a;
            context.getClass();
            if (Build.VERSION.SDK_INT <= 32) {
                ArrayList arrayList = new ArrayList(list);
                for (umd umd : list) {
                    umd.getClass();
                }
                list = arrayList;
            }
            ArrayList arrayList2 = new ArrayList(list.size());
            for (umd umd2 : list) {
                umd2.getClass();
                ShortcutInfo.Builder intents = new ShortcutInfo.Builder(umd2.a, umd2.b).setShortLabel(umd2.d).setIntents(umd2.c);
                IconCompat iconCompat = umd2.f;
                if (iconCompat != null) {
                    intents.setIcon(cs6.d(iconCompat, umd2.a));
                }
                if (!TextUtils.isEmpty(umd2.e)) {
                    intents.setLongLabel(umd2.e);
                }
                if (!TextUtils.isEmpty((CharSequence) null)) {
                    intents.setDisabledMessage((CharSequence) null);
                }
                xs xsVar = umd2.g;
                if (xsVar != null) {
                    intents.setCategories(xsVar);
                }
                intents.setRank(0);
                int i2 = Build.VERSION.SDK_INT;
                xr7 xr7 = umd2.h;
                if (xr7 != null) {
                    intents.setLocusId(xr7.b);
                }
                intents.setLongLived(umd2.i);
                if (i2 >= 33) {
                    gu4.c(intents);
                }
                arrayList2.add(intents.build());
            }
            if (((ShortcutManager) context.getSystemService(ShortcutManager.class)).setDynamicShortcuts(arrayList2)) {
                wmd.u(context).getClass();
                wmd.u(context).getClass();
                Iterator it = ((ArrayList) wmd.t(context)).iterator();
                if (it.hasNext()) {
                    au1.r(it.next());
                    throw null;
                }
            }
        } else {
            and.c();
        }
        return e5f;
    }
}
