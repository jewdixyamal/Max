package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.CancellationException;
import org.apache.http.util.LangUtils;
import ru.ok.android.externcalls.sdk.api.GetAnonymTokenByLinkRequest;
import ru.ok.android.externcalls.sdk.api.InternalIdResponse;
import ru.ok.android.externcalls.sdk.api.JoinByLinkResponse;
import ru.ok.tamtam.nano.Protos;

/* renamed from: ig5  reason: default package */
public final /* synthetic */ class ig5 implements qj3, b7b, b66, al5, cc3, qa5, ra5, ru0, za7, w56, xs6, ys6, d7b {
    public final /* synthetic */ int a;

    public /* synthetic */ ig5(int i) {
        this.a = i;
    }

    public ka5[] a() {
        switch (this.a) {
            case Protos.Attaches.Attach.PRESENT /*12*/:
                return new ka5[]{new lm5()};
            default:
                return new ka5[]{new ps5()};
        }
    }

    public void accept(Object obj) {
        switch (this.a) {
            case 0:
                hm9.p("jg5", "failed to open file attach", (Throwable) obj);
                return;
            case 1:
                hm9.p("jg5", "onEvent DownloadCompleteEvent: failed", (Throwable) obj);
                return;
            case 4:
                hm9.p("jg5", "initFileSharingProgressDialog: error", (Throwable) obj);
                return;
            case LangUtils.HASH_SEED /*17*/:
                hm9.p("FrgAttachView", "fail", (Throwable) obj);
                return;
            case 18:
                hm9.p("ru.ok.messages.views.fragments.FrgProfilePhoto", "fail", (Throwable) obj);
                return;
            default:
                j10 j10 = (j10) obj;
                j10.i = d20.o;
                j10.k = 0.0f;
                j10.p = 0;
                j10.o = 0;
                return;
        }
    }

    /* renamed from: apply  reason: collision with other method in class */
    public boolean m61apply(Object obj) {
        ww0 ww0 = (ww0) obj;
        CancellationException cancellationException = iv6.l;
        return true;
    }

    public boolean c(int i, int i2, int i3, int i4, int i5) {
        switch (this.a) {
            case 22:
                return false;
            default:
                return false;
        }
    }

    public void e(long j) {
    }

    public Object f(bg4 bg4) {
        return FirebaseInstallationsRegistrar.lambda$getComponents$0(bg4);
    }

    public su0 g(Bundle bundle) {
        switch (this.a) {
            case 16:
                my5 my5 = new my5();
                if (bundle != null) {
                    ClassLoader classLoader = tu0.class.getClassLoader();
                    int i = maf.a;
                    bundle.setClassLoader(classLoader);
                }
                String string = bundle.getString(Integer.toString(0, 36));
                oy5 oy5 = oy5.R0;
                String str = oy5.a;
                if (string == null) {
                    string = str;
                }
                my5.a = string;
                String string2 = bundle.getString(Integer.toString(1, 36));
                if (string2 == null) {
                    string2 = oy5.b;
                }
                my5.b = string2;
                String string3 = bundle.getString(Integer.toString(2, 36));
                if (string3 == null) {
                    string3 = oy5.c;
                }
                my5.c = string3;
                my5.d = bundle.getInt(Integer.toString(3, 36), oy5.o);
                my5.e = bundle.getInt(Integer.toString(4, 36), oy5.X);
                my5.f = bundle.getInt(Integer.toString(5, 36), oy5.Y);
                my5.g = bundle.getInt(Integer.toString(6, 36), oy5.Z);
                String string4 = bundle.getString(Integer.toString(7, 36));
                if (string4 == null) {
                    string4 = oy5.t0;
                }
                my5.h = string4;
                e99 e99 = (e99) bundle.getParcelable(Integer.toString(8, 36));
                if (e99 == null) {
                    e99 = oy5.u0;
                }
                my5.i = e99;
                String string5 = bundle.getString(Integer.toString(9, 36));
                if (string5 == null) {
                    string5 = oy5.v0;
                }
                my5.j = string5;
                String string6 = bundle.getString(Integer.toString(10, 36));
                if (string6 == null) {
                    string6 = oy5.w0;
                }
                my5.k = string6;
                my5.l = bundle.getInt(Integer.toString(11, 36), oy5.x0);
                ArrayList arrayList = new ArrayList();
                int i2 = 0;
                while (true) {
                    String num = Integer.toString(12, 36);
                    String num2 = Integer.toString(i2, 36);
                    StringBuilder sb = new StringBuilder(rh4.e(rh4.e(1, num), num2));
                    sb.append(num);
                    sb.append("_");
                    sb.append(num2);
                    byte[] byteArray = bundle.getByteArray(sb.toString());
                    if (byteArray == null) {
                        my5.m = arrayList;
                        my5.n = (cr4) bundle.getParcelable(Integer.toString(13, 36));
                        my5.o = bundle.getLong(Integer.toString(14, 36), oy5.A0);
                        my5.p = bundle.getInt(Integer.toString(15, 36), oy5.B0);
                        my5.q = bundle.getInt(Integer.toString(16, 36), oy5.C0);
                        my5.r = bundle.getFloat(Integer.toString(17, 36), oy5.D0);
                        my5.s = bundle.getInt(Integer.toString(18, 36), oy5.E0);
                        my5.t = bundle.getFloat(Integer.toString(19, 36), oy5.F0);
                        my5.u = bundle.getByteArray(Integer.toString(20, 36));
                        my5.v = bundle.getInt(Integer.toString(21, 36), oy5.H0);
                        Bundle bundle2 = bundle.getBundle(Integer.toString(22, 36));
                        my5.w = bundle2 == null ? null : new h63(bundle2.getInt(Integer.toString(0, 36), -1), bundle2.getInt(Integer.toString(1, 36), -1), bundle2.getInt(Integer.toString(2, 36), -1), bundle2.getByteArray(Integer.toString(3, 36)));
                        my5.x = bundle.getInt(Integer.toString(23, 36), oy5.J0);
                        my5.y = bundle.getInt(Integer.toString(24, 36), oy5.K0);
                        my5.z = bundle.getInt(Integer.toString(25, 36), oy5.L0);
                        my5.A = bundle.getInt(Integer.toString(26, 36), oy5.M0);
                        my5.B = bundle.getInt(Integer.toString(27, 36), oy5.N0);
                        my5.C = bundle.getInt(Integer.toString(28, 36), oy5.O0);
                        my5.D = bundle.getInt(Integer.toString(29, 36), oy5.P0);
                        return new oy5(my5);
                    }
                    arrayList.add(byteArray);
                    i2++;
                }
            default:
                np8.d(bundle.getInt(Integer.toString(0, 36), -1) == 0);
                return bundle.getBoolean(Integer.toString(1, 36), false) ? new oj6(bundle.getBoolean(Integer.toString(2, 36), false)) : new oj6();
        }
    }

    public String i(Context context) {
        switch (this.a) {
            case 7:
                ApplicationInfo applicationInfo = context.getApplicationInfo();
                return applicationInfo != null ? String.valueOf(applicationInfo.targetSdkVersion) : "";
            case 8:
                ApplicationInfo applicationInfo2 = context.getApplicationInfo();
                return applicationInfo2 != null ? String.valueOf(applicationInfo2.minSdkVersion) : "";
            case 9:
                return context.getPackageManager().hasSystemFeature("android.hardware.type.television") ? "tv" : context.getPackageManager().hasSystemFeature("android.hardware.type.watch") ? "watch" : context.getPackageManager().hasSystemFeature("android.hardware.type.automotive") ? "auto" : context.getPackageManager().hasSystemFeature("android.hardware.type.embedded") ? "embedded" : "";
            default:
                String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                return installerPackageName != null ? FirebaseCommonRegistrar.a(installerPackageName) : "";
        }
    }

    public Object parse(db7 db7) {
        switch (this.a) {
            case 19:
                return GetAnonymTokenByLinkRequest.lambda$static$0(db7);
            case 25:
                return InternalIdResponse.parse(db7);
            case 27:
                return JoinByLinkResponse.lambda$static$0(db7);
            case 28:
                return db7.H();
            default:
                return Boolean.valueOf(db7.a0());
        }
    }

    public boolean test(Object obj) {
        return ((es8) obj).a.m(g20.u0);
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 3:
                return ((es8) obj).a.z0.k(g20.u0);
            case 5:
                return new ff5((String) null, Collections.singletonList(new df5(3, 0, 0, 0, ((yg5) obj).c)));
            default:
                tn6 tn6 = (tn6) obj;
                tn6.d();
                return zw6.j(br7.Z(new hme(16), tn6.T0.b));
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public la5[] m60a() {
        switch (this.a) {
            case 13:
                return new la5[]{new mm5()};
            default:
                return new la5[]{new qs5()};
        }
    }
}
