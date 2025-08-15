package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.media3.common.VideoFrameProcessingException;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import one.me.aboutappsettings.AboutAppSettingsScreen;
import org.webrtc.NativeDoubleArrayConsumer;
import ru.ok.android.externcalls.sdk.api.BatchInternalIdResponse;
import ru.ok.messages.contacts.profile.ActContactAvatars;
import ru.ok.messages.media.attaches.ActAttachesView;
import ru.ok.messages.media.attaches.AttachPhotoView;
import ru.ok.messages.views.ActProfilePhoto;
import ru.ok.tamtam.nano.Protos;

/* renamed from: xw0  reason: default package */
public final /* synthetic */ class xw0 implements o1d, qa5, ra5, qj3, kwe, ru0, NativeDoubleArrayConsumer.Consumer, b66, dd6, za7 {
    public static final xw0 X = new xw0(3);
    public static final xw0 Y = new xw0(4);
    public static final xw0 Z = new xw0(5);
    public static final xw0 b = new xw0(0);
    public static final xw0 c = new xw0(1);
    public static final xw0 o = new xw0(2);
    public final /* synthetic */ int a;

    public /* synthetic */ xw0(int i) {
        this.a = i;
    }

    public ka5[] a() {
        switch (this.a) {
            case 7:
                return new ka5[]{new q3()};
            case 9:
                return new ka5[]{new u3()};
            default:
                return new ka5[]{new dc()};
        }
    }

    public void accept(Object obj) {
        switch (this.a) {
            case 11:
                Throwable th = (Throwable) obj;
                HashSet hashSet = ActAttachesView.z1;
                return;
            case Protos.Attaches.Attach.PRESENT /*12*/:
                int i = ActContactAvatars.h1;
                hm9.p("ru.ok.messages.contacts.profile.ActContactAvatars", "During deleting self photo got error", (Throwable) obj);
                return;
            case 13:
                int i2 = ActContactAvatars.h1;
                hm9.p("ru.ok.messages.contacts.profile.ActContactAvatars", "During making photo main got error", (Throwable) obj);
                return;
            case 20:
                ((j10) obj).i = d20.X;
                return;
            case 21:
                Throwable th2 = (Throwable) obj;
                hm9.o("rz", "Can't update not started live video");
                return;
            case 22:
                int i3 = AttachPhotoView.U0;
                hm9.p("ru.ok.messages.media.attaches.AttachPhotoView", "Can't save file", (Throwable) obj);
                return;
            case 25:
                hm9.p("qy7", "loadMarkerIcon: can't load marker", (Throwable) obj);
                return;
            case 26:
                hm9.p("qy7", "loadMarkerIcon: can't load marker", (Throwable) obj);
                return;
            case 27:
                hm9.p("qy7", "setMapStyle: can't load map style", (Throwable) obj);
                return;
            default:
                hm9.p("qy7", "loadMarkerIcon: can't load marker", (Throwable) obj);
                return;
        }
    }

    public Object apply(Object obj) {
        return Uri.fromFile((File) obj);
    }

    public void c(VideoFrameProcessingException videoFrameProcessingException) {
    }

    public void consume(Double[] dArr) {
    }

    public String e(a34 a34) {
        String str = a34.h;
        return str != null ? str : a34.a.toString();
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [ww6, pw6] */
    public zw6 f(String str) {
        zw6 zw6;
        zw6 f = h15.f(str);
        ge4 ge4 = new ge4(1, str);
        f.getClass();
        k77 k77 = new k77(f, ge4);
        if (k77 instanceof Collection) {
            zw6 = zw6.j((Collection) k77);
        } else {
            p1 p1Var = (p1) k77.iterator();
            if (!p1Var.hasNext()) {
                zw6 = ffc.X;
            } else {
                Object next = p1Var.next();
                if (!p1Var.hasNext()) {
                    zw6 = zw6.n(next);
                } else {
                    ? pw6 = new pw6(4);
                    pw6.a(next);
                    while (p1Var.hasNext()) {
                        pw6.a(p1Var.next());
                    }
                    zw6 = pw6.j();
                }
            }
        }
        return zw6.isEmpty() ? f : zw6;
    }

    public su0 g(Bundle bundle) {
        p8[] p8VarArr;
        switch (this.a) {
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(Integer.toString(1, 36));
                if (parcelableArrayList == null) {
                    p8VarArr = new p8[0];
                } else {
                    p8[] p8VarArr2 = new p8[parcelableArrayList.size()];
                    for (int i = 0; i < parcelableArrayList.size(); i++) {
                        p8VarArr2[i] = (p8) p8.s0.g((Bundle) parcelableArrayList.get(i));
                    }
                    p8VarArr = p8VarArr2;
                }
                return new r8(p8VarArr, bundle.getLong(Integer.toString(2, 36), 0), bundle.getLong(Integer.toString(3, 36), -9223372036854775807L), bundle.getInt(Integer.toString(4, 36)));
            default:
                long j = bundle.getLong(Integer.toString(0, 36));
                int i2 = bundle.getInt(Integer.toString(1, 36), -1);
                ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(Integer.toString(2, 36));
                int[] intArray = bundle.getIntArray(Integer.toString(3, 36));
                long[] longArray = bundle.getLongArray(Integer.toString(4, 36));
                return new p8(j, i2, intArray == null ? new int[0] : intArray, parcelableArrayList2 == null ? new Uri[0] : (Uri[]) parcelableArrayList2.toArray(new Uri[0]), longArray == null ? new long[0] : longArray, bundle.getLong(Integer.toString(5, 36)), bundle.getBoolean(Integer.toString(6, 36)));
        }
    }

    public int i(int i) {
        int i2 = AboutAppSettingsScreen.c;
        return 4;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        int i = ActProfilePhoto.Y0;
        return false;
    }

    public Object parse(db7 db7) {
        return BatchInternalIdResponse.parse(db7);
    }

    /* renamed from: a  reason: collision with other method in class */
    public la5[] m52a() {
        switch (this.a) {
            case 8:
                return new la5[]{new r3()};
            case 10:
                return new la5[]{new v3()};
            default:
                return new la5[]{new ec(0)};
        }
    }
}
