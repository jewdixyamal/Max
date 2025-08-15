package defpackage;

import android.app.PendingIntent;
import android.location.Location;
import android.media.MediaCodec;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Trace;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.Executor;
import kotlin.NoWhenBranchMatchedException;
import org.apache.http.util.LangUtils;
import org.json.JSONObject;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;
import ru.ok.tamtam.nano.Protos;

/* renamed from: yb9  reason: default package */
public final class yb9 implements b66, cc3, yoe, df9, b7b, q78, ofc {
    public static final yb9 X = new Object();
    public static yb9 Y;
    public static final /* synthetic */ yb9 Z = new Object();
    public static final yb9 a = new Object();
    public static final yb9 b = new Object();
    public static final yb9 c = new Object();
    public static final /* synthetic */ yb9 o = new Object();

    public static MediaCodec a(o78 o78) {
        o78.a.getClass();
        String str = o78.a.a;
        Trace.beginSection("createCodec:" + str);
        MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
        Trace.endSection();
        return createByCodecName;
    }

    public static String c(short s) {
        return String.format("0x%s", Arrays.copyOf(new Object[]{Integer.toHexString(s & 65535)}, 1));
    }

    public static int d(int i) {
        if (i == 20) {
            return 63750;
        }
        if (i == 30) {
            return 2250000;
        }
        switch (i) {
            case 5:
                return 80000;
            case 6:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case Protos.Attaches.Attach.PRESENT:
                return 7000;
            default:
                switch (i) {
                    case Protos.Attaches.Attach.LOCATION:
                        return 3062500;
                    case Protos.Attaches.Attach.DAILY_MEDIA:
                        return 8000;
                    case 16:
                        return 256000;
                    case LangUtils.HASH_SEED:
                        return 336000;
                    case 18:
                        return 768000;
                    default:
                        throw new IllegalArgumentException();
                }
        }
    }

    public static zad e(JSONObject jSONObject) {
        return jSONObject.has("roomId") ? new yad(jSONObject.getInt("roomId")) : xad.a;
    }

    public static String g(gq9 gq9) {
        if (gq9 instanceof bq9) {
            return "auto," + ((bq9) gq9).b;
        } else if (gq9.equals(cq9.b)) {
            return "disabled";
        } else {
            if (gq9 instanceof eq9) {
                eq9 eq9 = (eq9) gq9;
                kt4 kt4 = kt4.MINUTES;
                return rh4.h("schedule,", (int) ote.f(ft4.i(eq9.b, kt4), -2147483648L, 2147483647L), (int) ote.f(ft4.i(eq9.c, kt4), -2147483648L, 2147483647L), ",");
            } else if (gq9.equals(fq9.b)) {
                return "system";
            } else {
                if (gq9.equals(dq9.b)) {
                    return "enabled";
                }
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public void accept(Object obj, Object obj2) {
        pe5 pe5;
        qne qne = (qne) obj2;
        bhg bhg = (bhg) obj;
        yd7 yd7 = new yd7(Long.MAX_VALUE, 0, false, (ghg) null);
        pe5[] h = bhg.h();
        pe5 pe52 = null;
        if (h != null) {
            int i = 0;
            while (true) {
                if (i >= h.length) {
                    pe5 = null;
                    break;
                }
                pe5 = h[i];
                if ("location_updates_with_callback".equals(pe5.a)) {
                    break;
                }
                i++;
            }
            if (pe5 != null && pe5.b() >= 1) {
                nkg nkg = (nkg) bhg.o();
                khg khg = new khg(4, (IBinder) null, new xgg(1, qne), (PendingIntent) null, (String) null);
                Parcel G0 = nkg.G0();
                zfg.b(G0, yd7);
                zfg.b(G0, khg);
                nkg.H0(G0, 90);
                return;
            }
        }
        pe5[] h2 = bhg.h();
        if (h2 != null) {
            int i2 = 0;
            while (true) {
                if (i2 >= h2.length) {
                    break;
                }
                pe5 pe53 = h2[i2];
                if ("get_last_location_with_request".equals(pe53.a)) {
                    pe52 = pe53;
                    break;
                }
                i2++;
            }
            if (pe52 != null && pe52.b() >= 1) {
                nkg nkg2 = (nkg) bhg.o();
                xgg xgg = new xgg(1, qne);
                Parcel G02 = nkg2.G0();
                zfg.b(G02, yd7);
                G02.writeStrongBinder(xgg);
                nkg2.H0(G02, 82);
                return;
            }
        }
        nkg nkg3 = (nkg) bhg.o();
        Parcel G03 = nkg3.G0();
        Parcel obtain = Parcel.obtain();
        try {
            nkg3.d.transact(7, G03, obtain, 0);
            obtain.readException();
            G03.recycle();
            obtain.recycle();
            qne.b((Location) zfg.a(obtain, Location.CREATOR));
        } catch (RuntimeException e) {
            obtain.recycle();
            throw e;
        } catch (Throwable th) {
            G03.recycle();
            throw th;
        }
    }

    public Object apply(Object obj) {
        return ((OneMeRoomDatabase) obj).v();
    }

    public int b(int i, CharSequence charSequence) {
        int i2 = 2;
        for (int i3 = 0; i3 < i && i2 == 2; i3++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i3));
            zoe zoe = bpe.a;
            if (directionality != 0) {
                if (!(directionality == 1 || directionality == 2)) {
                    switch (directionality) {
                        case Protos.Attaches.Attach.LOCATION:
                        case Protos.Attaches.Attach.DAILY_MEDIA:
                            break;
                        case 16:
                        case LangUtils.HASH_SEED:
                            break;
                        default:
                            i2 = 2;
                            break;
                    }
                }
                i2 = 0;
            }
            i2 = 1;
        }
        return i2;
    }

    public Object f(bg4 bg4) {
        return nd7.s((Executor) bg4.f(new lqb(kh7.class, Executor.class)));
    }

    /* JADX WARNING: type inference failed for: r4v4, types: [s78, java.lang.Object, adb] */
    public s78 i(o78 o78) {
        MediaCodec mediaCodec = null;
        try {
            MediaCodec a2 = a(o78);
            Trace.beginSection("configureCodec");
            a2.configure(o78.b, o78.d, o78.e, 0);
            Trace.endSection();
            Trace.beginSection("startCodec");
            a2.start();
            Trace.endSection();
            ? obj = new Object();
            obj.a = a2;
            if (oaf.a < 21) {
                obj.b = a2.getInputBuffers();
                obj.c = a2.getOutputBuffers();
            }
            return obj;
        } catch (IOException | RuntimeException e) {
            if (mediaCodec != null) {
                mediaCodec.release();
            }
            throw e;
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, lk] */
    public Object r(gy8 gy8) {
        ? obj = new Object();
        obj.c = "";
        int N = lz7.N(gy8);
        for (int i = 0; i < N; i++) {
            String P = lz7.P(gy8);
            P.getClass();
            char c2 = 65535;
            switch (P.hashCode()) {
                case -1724546052:
                    if (P.equals("description")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case 3373707:
                    if (P.equals("name")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case 93925698:
                    if (P.equals("botId")) {
                        c2 = 2;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    obj.c = lz7.P(gy8);
                    break;
                case 1:
                    obj.b = lz7.P(gy8);
                    break;
                case 2:
                    obj.a = lz7.M(gy8, 0);
                    break;
                default:
                    gy8.z();
                    break;
            }
        }
        return new bq0(obj);
    }

    public boolean test(Object obj) {
        return true;
    }
}
