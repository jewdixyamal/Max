package defpackage;

import android.os.Bundle;
import androidx.media3.exoplayer.ExoPlaybackException;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.notifications.settings.screens.dialog.DialogNotificationsSettingsScreen;
import org.apache.http.util.LangUtils;
import org.webrtc.EglThread;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;
import ru.ok.tamtam.nano.Protos;

/* renamed from: ta4  reason: default package */
public final /* synthetic */ class ta4 implements w56, ru0, cc3, o1d, qj3, qr4, rr4, EglThread.ReleaseMonitor, km7, jm7, b66 {
    public final /* synthetic */ int a;

    public /* synthetic */ ta4(int i) {
        this.a = i;
    }

    private final void b() {
    }

    private final void c() {
    }

    public Constructor a() {
        Class<la5> cls = la5.class;
        switch (this.a) {
            case 0:
                if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", (Class[]) null).invoke((Object) null, (Object[]) null))) {
                    return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(cls).getConstructor(new Class[]{Integer.TYPE});
                }
                return null;
            default:
                return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(cls).getConstructor((Class[]) null);
        }
    }

    public void accept(Object obj) {
        switch (this.a) {
            case 6:
                ((j10) obj).m = "";
                return;
            case 10:
                hm9.p("sx4", "Can't invalidate", (Throwable) obj);
                return;
            case 28:
                hm9.p("sc5", "failed favorites obs", (Throwable) obj);
                return;
            default:
                hm9.m("sc5", "on next favorite ids to subject: %s", (List) obj);
                return;
        }
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 2:
                tze tze = (tze) obj;
                tze.getClass();
                Bundle bundle = new Bundle();
                ffc ffc = tze.b;
                ArrayList arrayList = new ArrayList(ffc.o);
                ls5 l = ffc.listIterator(0);
                while (l.hasNext()) {
                    arrayList.add(((rze) l.next()).f());
                }
                bundle.putParcelableArrayList(tze.e, arrayList);
                return bundle;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                return new h74((rhe) obj);
            case 16:
                return new i74((she) obj);
            case 21:
                od5 od5 = (od5) obj;
                od5.getClass();
                return new sa3(2, new ia4(3, od5));
            case 22:
                od5 od52 = (od5) obj;
                Objects.requireNonNull(od52);
                return new q1a(2, new dc5(od52, 0));
            case 23:
                return ((OneMeRoomDatabase) obj).B();
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                od5 od53 = (od5) obj;
                Objects.requireNonNull(od53);
                return new q1a(2, new dc5(od53, 1));
            case 25:
                od5 od54 = (od5) obj;
                od54.getClass();
                uh uhVar = new uh(od54, 7, xlc.a(0, "SELECT id FROM favorite_stickers ORDER BY `index` ASC"));
                return ngg.o((OneMeRoomDatabase) od54.a, new String[]{"favorite_stickers"}, uhVar);
            case 26:
                return new uqd(((wc5) obj).a(), new nc5(10), 0);
            default:
                return new q28(((wc5) obj).a(), new nc5(11), 3);
        }
    }

    public Object f(bg4 bg4) {
        switch (this.a) {
            case 4:
                Set b = bg4.b(lqb.a(va0.class));
                wd6 wd6 = wd6.c;
                if (wd6 == null) {
                    synchronized (wd6.class) {
                        try {
                            wd6 = wd6.c;
                            if (wd6 == null) {
                                wd6 = new wd6(0);
                                wd6.c = wd6;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                return new ef4(b, wd6);
            case 11:
                return ExecutorsRegistrar.lambda$getComponents$4(bg4);
            case Protos.Attaches.Attach.PRESENT /*12*/:
                return ExecutorsRegistrar.lambda$getComponents$5(bg4);
            case 13:
                return ExecutorsRegistrar.lambda$getComponents$6(bg4);
            default:
                return s4f.a;
        }
    }

    public su0 g(Bundle bundle) {
        boolean z = false;
        int i = bundle.getInt(Integer.toString(0, 36), -1);
        int[] intArray = bundle.getIntArray(Integer.toString(1, 36));
        int i2 = bundle.getInt(Integer.toString(2, 36), -1);
        if (i >= 0 && i2 >= 0) {
            z = true;
        }
        np8.d(z);
        intArray.getClass();
        return new qe4(i, i2, intArray);
    }

    public int i(int i) {
        bc7[] bc7Arr = DialogNotificationsSettingsScreen.Y;
        return 4;
    }

    public void invoke(Object obj) {
        switch (this.a) {
            case LangUtils.HASH_SEED /*17*/:
                ((n3b) obj).x0(new ExoPlaybackException(2, new RuntimeException("Player release timed out."), 1003));
                return;
            case 18:
                ((m3b) obj).p();
                return;
            case 19:
                ((m3b) obj).getClass();
                return;
            default:
                ((n3b) obj).i0();
                return;
        }
    }

    public boolean onRelease(EglThread eglThread) {
        return EglThread.lambda$create$1(eglThread);
    }

    public void release() {
        int i = this.a;
    }
}
