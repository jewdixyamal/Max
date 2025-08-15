package defpackage;

import android.content.ClipData;
import android.net.Uri;
import android.os.Build;
import android.util.Pair;
import android.view.View;
import java.util.ArrayList;

/* renamed from: hv8  reason: default package */
public final /* synthetic */ class hv8 implements v3a {
    public final /* synthetic */ m56 a;

    public /* synthetic */ hv8(zz8 zz8) {
        this.a = zz8;
    }

    public final bt3 a(View view, bt3 bt3) {
        Pair pair;
        sy4 sy4;
        ys3 ys3;
        at3 at3 = bt3.a;
        ClipData c = at3.c();
        boolean z = true;
        Uri uri = null;
        if (c.getItemCount() == 1) {
            if (c.getItemAt(0).getUri() == null) {
                z = false;
            }
            bt3 bt32 = z ? bt3 : null;
            if (z) {
                bt3 = null;
            }
            pair = Pair.create(bt32, bt3);
        } else {
            ArrayList arrayList = null;
            ArrayList arrayList2 = null;
            for (int i = 0; i < c.getItemCount(); i++) {
                ClipData.Item itemAt = c.getItemAt(i);
                if (itemAt.getUri() != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(itemAt);
                } else {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(itemAt);
                }
            }
            Pair create = arrayList == null ? Pair.create((Object) null, c) : arrayList2 == null ? Pair.create(c, (Object) null) : Pair.create(bt3.a(c.getDescription(), arrayList), bt3.a(c.getDescription(), arrayList2));
            if (create.first == null) {
                pair = Pair.create((Object) null, bt3);
            } else if (create.second == null) {
                pair = Pair.create(bt3, (Object) null);
            } else {
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 31) {
                    sy4 = new sy4(bt3);
                } else {
                    zs3 zs3 = new zs3();
                    zs3.b = at3.c();
                    zs3.c = at3.r();
                    zs3.o = at3.getFlags();
                    zs3.X = at3.g();
                    zs3.Y = at3.getExtras();
                    sy4 = zs3;
                }
                sy4.d((ClipData) create.first);
                bt3 build = sy4.build();
                if (i2 >= 31) {
                    ys3 = new sy4(bt3);
                } else {
                    zs3 zs32 = new zs3();
                    zs32.b = at3.c();
                    zs32.c = at3.r();
                    zs32.o = at3.getFlags();
                    zs32.X = at3.g();
                    zs32.Y = at3.getExtras();
                    ys3 = zs32;
                }
                ys3.d((ClipData) create.second);
                pair = Pair.create(build, ys3.build());
            }
        }
        bt3 bt33 = (bt3) pair.first;
        bt3 bt34 = (bt3) pair.second;
        if (bt33 != null) {
            at3 at32 = bt33.a;
            if (at32.c().getItemCount() > 0) {
                uri = at32.c().getItemAt(0).getUri();
            }
        }
        if (uri != null) {
            this.a.invoke(uri);
        }
        return bt34;
    }
}
