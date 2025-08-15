package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.Choreographer;
import android.view.ViewPropertyAnimator;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import com.google.android.gms.tasks.Task;
import com.google.android.material.datepicker.MaterialCalendar;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.Continuation;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.EncodedImage;
import org.webrtc.VideoCodecInfo;
import org.webrtc.VideoCodecStatus;
import org.webrtc.VideoDecoder;
import org.webrtc.VideoDecoderFallback;
import ru.ok.tamtam.nano.Protos;

/* renamed from: ph4  reason: default package */
public class ph4 implements e9a, a76, q03, ab3, ypa, l3a, h99, VideoDecoder {
    public static final ph4 c = new ph4(1);
    public Object a;
    public Object b;

    public /* synthetic */ ph4(Object obj) {
        this.a = obj;
        this.b = null;
    }

    public static mce k(SpannableString spannableString, int i, rce rce) {
        mce mce;
        int i2 = 0;
        mce[] mceArr = (mce[]) spannableString.getSpans(0, spannableString.length(), mce.class);
        if (mceArr != null) {
            int length = mceArr.length;
            while (true) {
                if (i2 >= length) {
                    mce = null;
                    break;
                }
                mce = mceArr[i2];
                int spanStart = spannableString.getSpanStart(mce);
                int spanEnd = spannableString.getSpanEnd(mce);
                if (mce.a.a == rce.a && spanStart <= i && i <= spanEnd && spanEnd - spanStart > 0) {
                    break;
                }
                i2++;
            }
            if (mce != null) {
                return mce;
            }
        }
        return null;
    }

    public static o01 s(JSONObject jSONObject) {
        bg1 b2 = bg1.b(jSONObject.optString("initiatorId"));
        Long l = null;
        if (b2 == null) {
            return null;
        }
        if (jSONObject.has("movieId")) {
            l = Long.valueOf(jSONObject.optLong("movieId"));
        }
        return new o01(b2, l);
    }

    public /* bridge */ /* synthetic */ void a(Object obj) {
        Void voidR = (Void) obj;
    }

    public void b() {
        ib3 ib3 = (ib3) this.b;
        ib3.getClass();
        Object obj = ib3.c;
        erd erd = (erd) this.a;
        if (obj == null) {
            erd.onError(new NullPointerException("The value supplied is null"));
        } else {
            erd.a(obj);
        }
    }

    public void c(zl4 zl4) {
        ((erd) this.a).c(zl4);
    }

    public long createNative(long j) {
        return ((VideoDecoder) this.a).createNative(j);
    }

    public void d(Throwable th) {
        kq0.e();
        l84 l84 = (l84) this.b;
        x9b x9b = (x9b) l84.a;
        if (((x9b) this.a) == x9b) {
            int i = x9b.a;
            y7g y7g = (y7g) l84.e;
            if (y7g != null) {
                y7g.c = null;
            }
            l84.a = null;
        }
    }

    public VideoCodecStatus decode(EncodedImage encodedImage, VideoDecoder.DecodeInfo decodeInfo, long j) {
        return ((VideoDecoder) this.a).decode(encodedImage, decodeInfo, j);
    }

    public void e(ova ova) {
        ((ConcurrentHashMap) this.a).put(((gy7) this.b).b(ova), ova);
    }

    public gx3 f() {
        return new gx3(this);
    }

    public Object g(Uri uri, w24 w24) {
        nk5 nk5 = (nk5) ((ypa) this.a).g(uri, w24);
        List list = (List) this.b;
        return (list == null || list.isEmpty()) ? nk5 : (nk5) nk5.a(list);
    }

    public String getImplementationName() {
        VideoDecoder videoDecoder = (VideoDecoder) this.a;
        return videoDecoder instanceof VideoDecoderFallback ? "VideoDecoderFallback" : videoDecoder.getImplementationName();
    }

    public void h() {
        ViewPropertyAnimator viewPropertyAnimator = (ViewPropertyAnimator) this.a;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            return;
        }
        Animation animation = (Animation) this.b;
        if (animation != null) {
            animation.cancel();
        }
    }

    public void i(n54 n54) {
        synchronized (n54) {
        }
        Handler handler = (Handler) this.a;
        if (handler != null) {
            handler.post(new y60(this, n54, 1));
        }
    }

    public VideoCodecStatus initDecode(VideoDecoder.Settings settings, VideoDecoder.Callback callback) {
        ((a4c) this.b).log("VideoDecoderLifecycleLogger", "initDecode(cores=" + settings.numberOfCores + ", size=" + settings.width + "x" + settings.height + ")");
        return ((VideoDecoder) this.a).initDecode(settings, callback);
    }

    public byte[] j(d45 d45) {
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) this.a;
        byteArrayOutputStream.reset();
        DataOutputStream dataOutputStream = (DataOutputStream) this.b;
        try {
            dataOutputStream.writeBytes(d45.a);
            dataOutputStream.writeByte(0);
            String str = d45.b;
            if (str == null) {
                str = "";
            }
            dataOutputStream.writeBytes(str);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeLong(d45.c);
            dataOutputStream.writeLong(d45.o);
            dataOutputStream.write(d45.X);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void l(Task task) {
        Exception e = task.e();
        if (e != null) {
            hm9.p(((xe6) this.b).b, "fail deletePushToken", new Exception("failure to delete token", e));
        }
        ((Continuation) this.a).resumeWith(e5f.a);
    }

    public File m() {
        if (((File) this.a) == null) {
            synchronized (this) {
                try {
                    if (((File) this.a) == null) {
                        fl5 fl5 = (fl5) this.b;
                        fl5.a();
                        File filesDir = fl5.a.getFilesDir();
                        this.a = new File(filesDir, "PersistedInstallation." + ((fl5) this.b).c() + ".json");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return (File) this.a;
    }

    public ArrayList n(String str) {
        xlc a2 = xlc.a(1, "SELECT work_spec_id FROM dependency WHERE prerequisite_id=?");
        if (str == null) {
            a2.W(1);
        } else {
            a2.f(1, str);
        }
        ilc ilc = (ilc) this.a;
        ilc.b();
        Cursor o = ilc.o(a2, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(o.getCount());
            while (o.moveToNext()) {
                arrayList.add(o.isNull(0) ? null : o.getString(0));
            }
            return arrayList;
        } finally {
            o.close();
            a2.n();
        }
    }

    public la5 o(Object... objArr) {
        Constructor constructor;
        synchronized (((AtomicBoolean) this.b)) {
            if (!((AtomicBoolean) this.b).get()) {
                try {
                    constructor = ((ta4) this.a).a();
                } catch (ClassNotFoundException unused) {
                    ((AtomicBoolean) this.b).set(true);
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating extension", e);
                }
            }
            constructor = null;
        }
        if (constructor == null) {
            return null;
        }
        try {
            return (la5) constructor.newInstance(objArr);
        } catch (Exception e2) {
            throw new IllegalStateException("Unexpected error creating extractor", e2);
        }
    }

    public void onError(Throwable th) {
        ((erd) this.a).onError(th);
    }

    public List p(CharSequence charSequence) {
        if (charSequence == null || w9e.C0(charSequence)) {
            return nz4.a;
        }
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) this.b;
        spannableStringBuilder.clear();
        spannableStringBuilder.clearSpans();
        spannableStringBuilder.append(charSequence);
        Object[] spans = spannableStringBuilder.getSpans(0, charSequence.length(), qu8.class);
        ArrayList arrayList = new ArrayList();
        for (Object obj : spans) {
            if (((qu8) obj).a.c == mu8.a) {
                arrayList.add(obj);
            }
        }
        return x53.D0(arrayList);
    }

    public boolean q(String str) {
        boolean z = true;
        xlc a2 = xlc.a(1, "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)");
        if (str == null) {
            a2.W(1);
        } else {
            a2.f(1, str);
        }
        ilc ilc = (ilc) this.a;
        ilc.b();
        Cursor o = ilc.o(a2, (CancellationSignal) null);
        try {
            boolean z2 = false;
            if (o.moveToFirst()) {
                if (o.getInt(0) == 0) {
                    z = false;
                }
                z2 = z;
            }
            return z2;
        } finally {
            o.close();
            a2.n();
        }
    }

    public void r(hb0 hb0) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", (Object) hb0.a);
            jSONObject.put("Status", au1.s(hb0.b));
            jSONObject.put("AuthToken", (Object) hb0.c);
            jSONObject.put("RefreshToken", (Object) hb0.d);
            jSONObject.put("TokenCreationEpochInSecs", hb0.f);
            jSONObject.put("ExpiresInSecs", hb0.e);
            jSONObject.put("FisError", (Object) hb0.g);
            fl5 fl5 = (fl5) this.b;
            fl5.a();
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", fl5.a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (!createTempFile.renameTo(m())) {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    public VideoCodecStatus release() {
        ((a4c) this.b).log("VideoDecoderLifecycleLogger", "release()");
        return ((VideoDecoder) this.a).release();
    }

    public hb0 t() {
        JSONObject jSONObject;
        FileInputStream fileInputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            fileInputStream = new FileInputStream(m());
            while (true) {
                int read = fileInputStream.read(bArr, 0, 16384);
                if (read < 0) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        String optString = jSONObject.optString("Fid", (String) null);
        int optInt = jSONObject.optInt("Status", 0);
        String optString2 = jSONObject.optString("AuthToken", (String) null);
        String optString3 = jSONObject.optString("RefreshToken", (String) null);
        long optLong = jSONObject.optLong("TokenCreationEpochInSecs", 0);
        long optLong2 = jSONObject.optLong("ExpiresInSecs", 0);
        String optString4 = jSONObject.optString("FisError", (String) null);
        int i = au1.v(5)[optInt];
        if (i != 0) {
            Long valueOf = Long.valueOf(optLong);
            Long valueOf2 = Long.valueOf(optLong2);
            String str = i == 0 ? " registrationStatus" : "";
            if (str.isEmpty()) {
                return new hb0(i, valueOf2.longValue(), valueOf.longValue(), optString, optString2, optString3, optString4);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }
        throw new NullPointerException("Null registrationStatus");
        throw th;
    }

    public void u(kp kpVar) {
        if (this == c) {
            kpVar.r();
            kpVar.p();
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = (ViewPropertyAnimator) this.a;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.withStartAction(new kg(kpVar, 0));
            viewPropertyAnimator.withEndAction(new kg(kpVar, 1));
            return;
        }
        Animation animation = (Animation) this.b;
        if (animation != null) {
            animation.setAnimationListener(new ng(4, kpVar));
        }
    }

    public /* synthetic */ ph4(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public /* synthetic */ ph4(Object obj, Object obj2, boolean z) {
        this.b = obj;
        this.a = obj2;
    }

    public ph4(VideoDecoder videoDecoder, VideoCodecInfo videoCodecInfo, a4c a4c) {
        this.a = videoDecoder;
        this.b = a4c;
        try {
            if (videoDecoder instanceof VideoDecoderFallback) {
                a4c.log("VideoDecoderLifecycleLogger", "createDecoder(VideoDecoderFallback), codec: " + videoCodecInfo);
                return;
            }
            a4c.log("VideoDecoderLifecycleLogger", "createDecoder(" + videoDecoder.getImplementationName() + "), codec: " + videoCodecInfo);
        } catch (Throwable th) {
            a4c.logException("VideoDecoderLifecycleLogger", "createDecoder failed to read implementation name from " + videoDecoder.getClass().getName() + ", codec: " + videoCodecInfo, th);
        }
    }

    public ph4(ilc ilc, int i) {
        switch (i) {
            case 23:
                this.a = ilc;
                this.b = Collections.newSetFromMap(new IdentityHashMap());
                return;
            default:
                this.a = ilc;
                this.b = new sh(ilc, 5);
                return;
        }
    }

    public ph4(TranslateAnimation translateAnimation) {
        this.a = null;
        this.b = translateAnimation;
    }

    public ph4(int i) {
        switch (i) {
            case 3:
                this.a = Choreographer.getInstance();
                this.b = Looper.myLooper();
                return;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                this.a = new LinkedHashMap();
                return;
            case 18:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                this.a = byteArrayOutputStream;
                this.b = new DataOutputStream(byteArrayOutputStream);
                return;
            default:
                this.a = null;
                this.b = null;
                return;
        }
    }

    public ph4(gy7 gy7) {
        this.a = new ConcurrentHashMap();
        this.b = gy7;
    }

    public ph4(Context context, int i) {
        switch (i) {
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                this.a = context;
                return;
            default:
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(kq0.G(tsb.materialCalendarStyle, context, MaterialCalendar.class.getCanonicalName()).data, z2c.MaterialCalendar);
                rq9.n(context, obtainStyledAttributes.getResourceId(z2c.MaterialCalendar_dayStyle, 0));
                rq9.n(context, obtainStyledAttributes.getResourceId(z2c.MaterialCalendar_dayInvalidStyle, 0));
                rq9.n(context, obtainStyledAttributes.getResourceId(z2c.MaterialCalendar_daySelectedStyle, 0));
                rq9.n(context, obtainStyledAttributes.getResourceId(z2c.MaterialCalendar_dayTodayStyle, 0));
                ColorStateList q = ju0.q(context, obtainStyledAttributes, z2c.MaterialCalendar_rangeFillColor);
                this.a = rq9.n(context, obtainStyledAttributes.getResourceId(z2c.MaterialCalendar_yearStyle, 0));
                rq9.n(context, obtainStyledAttributes.getResourceId(z2c.MaterialCalendar_yearSelectedStyle, 0));
                this.b = rq9.n(context, obtainStyledAttributes.getResourceId(z2c.MaterialCalendar_yearTodayStyle, 0));
                new Paint().setColor(q.getDefaultColor());
                obtainStyledAttributes.recycle();
                return;
        }
    }

    public ph4(ta4 ta4) {
        this.a = ta4;
        this.b = new AtomicBoolean(false);
    }

    public ph4(Bundle bundle) {
        this.a = "androidx.media3.session.MediaLibraryService";
        this.b = bundle;
    }
}
