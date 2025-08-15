package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import ru.ok.tamtam.nano.Protos;
import ru.ok.tamtam.nano.b;

/* renamed from: fm9  reason: default package */
public abstract class fm9 implements rsc {
    public static boolean a;
    public static final int[] b = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    public static final int[] c = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    public static final int[] d = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};
    public static final byte[] e = {0, 0, 0, 1};
    public static final float[] f = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    public static final Object g = new Object();
    public static int[] h = new int[10];
    public static final pe5[] i = {new pe5("name_ulr_private", 1), new pe5("name_sleep_segment_request", 1), new pe5("get_last_activity_feature_id", 1), new pe5("support_context_feature_id", 1), new pe5("get_current_location", 2), new pe5("get_last_location_with_request", 1), new pe5("set_mock_mode_with_callback", 1), new pe5("set_mock_location_with_callback", 1), new pe5("inject_location_with_callback", 1), new pe5("location_updates_with_callback", 1), new pe5("use_safe_parcelable_in_intents", 1), new pe5("flp_debug_updates", 1), new pe5("google_location_accuracy_enabled", 1), new pe5("geofences_with_callback", 1), new pe5("location_enabled", 1)};

    public static rl8 A(String str) {
        Matcher matcher = rl8.d.matcher(str);
        if (matcher.lookingAt()) {
            String group = matcher.group(1);
            Locale locale = Locale.US;
            String lowerCase = group.toLowerCase(locale);
            matcher.group(2).toLowerCase(locale);
            ArrayList arrayList = new ArrayList();
            Matcher matcher2 = rl8.e.matcher(str);
            int end = matcher.end();
            while (end < str.length()) {
                matcher2.region(end, str.length());
                if (matcher2.lookingAt()) {
                    String group2 = matcher2.group(1);
                    if (group2 == null) {
                        end = matcher2.end();
                    } else {
                        String group3 = matcher2.group(2);
                        if (group3 == null) {
                            group3 = matcher2.group(3);
                        } else if (eae.o0(group3, "'", false) && group3.endsWith("'") && group3.length() > 2) {
                            group3 = group3.substring(1, group3.length() - 1);
                        }
                        arrayList.add(group2);
                        arrayList.add(group3);
                        end = matcher2.end();
                    }
                } else {
                    throw new IllegalArgumentException(("Parameter is not formatted correctly: \"" + str.substring(end) + "\" for: \"" + str + '\"').toString());
                }
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                return new rl8(str, lowerCase, (String[]) array);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        throw new IllegalArgumentException(("No subtype found for: \"" + str + '\"').toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r4 = r4.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final long B(defpackage.e52 r4) {
        /*
            long r0 = r4.n()
            es8 r4 = r4.c
            if (r4 == 0) goto L_0x000f
            cu8 r4 = r4.a
            if (r4 == 0) goto L_0x000f
            long r2 = r4.o
            goto L_0x0014
        L_0x000f:
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x0014:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x0019
            r0 = r2
        L_0x0019:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fm9.B(e52):long");
    }

    public static Object C(Future future) {
        Object obj;
        if (future.isDone()) {
            boolean z = false;
            while (true) {
                try {
                    obj = future.get();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
            return obj;
        }
        throw new IllegalStateException(i24.t("Future was expected to be done: %s", future));
    }

    public static Object D(Intent intent, String str, Class cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return m37.c(intent, str, cls);
        }
        Parcelable parcelableExtra = intent.getParcelableExtra(str);
        if (cls.isInstance(parcelableExtra)) {
            return parcelableExtra;
        }
        return null;
    }

    public static ew6 F(Object obj) {
        return obj == null ? ew6.b : new ew6(obj);
    }

    public static final boolean G(xd7 xd7) {
        return xd7 == null || w9e.C0(xd7.a);
    }

    public static long I(int i2, String str) {
        int q = q(str, 0, i2, false);
        Matcher matcher = lw3.m.matcher(str);
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        int i8 = -1;
        while (q < i2) {
            int q2 = q(str, q + 1, i2, true);
            matcher.region(q, q2);
            if (i4 == -1 && matcher.usePattern(lw3.m).matches()) {
                i4 = Integer.parseInt(matcher.group(1));
                i7 = Integer.parseInt(matcher.group(2));
                i8 = Integer.parseInt(matcher.group(3));
            } else if (i5 != -1 || !matcher.usePattern(lw3.l).matches()) {
                if (i6 == -1) {
                    Pattern pattern = lw3.k;
                    if (matcher.usePattern(pattern).matches()) {
                        i6 = w9e.A0(pattern.pattern(), matcher.group(1).toLowerCase(Locale.US), 0, false, 6) / 4;
                    }
                }
                if (i3 == -1 && matcher.usePattern(lw3.j).matches()) {
                    i3 = Integer.parseInt(matcher.group(1));
                }
            } else {
                i5 = Integer.parseInt(matcher.group(1));
            }
            q = q(str, q2 + 1, i2, false);
        }
        if (70 <= i3 && 99 >= i3) {
            i3 += 1900;
        }
        if (i3 >= 0 && 69 >= i3) {
            i3 += 2000;
        }
        if (!(i3 >= 1601)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (i6 == -1) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (1 > i5 || 31 < i5) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (i4 < 0 || 23 < i4) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (i7 < 0 || 59 < i7) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (i8 < 0 || 59 < i8) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else {
            GregorianCalendar gregorianCalendar = new GregorianCalendar(naf.e);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i3);
            gregorianCalendar.set(2, i6 - 1);
            gregorianCalendar.set(5, i5);
            gregorianCalendar.set(11, i4);
            gregorianCalendar.set(12, i7);
            gregorianCalendar.set(13, i8);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }
    }

    public static xl9 J(int i2, byte[] bArr, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int[] iArr;
        int i9;
        int i10;
        int i11;
        int i12;
        s02 s02 = new s02(i2 + 2, i3, 4, bArr);
        int i13 = 4;
        s02.t(4);
        int i14 = s02.i(3);
        s02.s();
        int i15 = s02.i(2);
        boolean h2 = s02.h();
        int i16 = s02.i(5);
        int i17 = 0;
        for (int i18 = 0; i18 < 32; i18++) {
            if (s02.h()) {
                i17 |= 1 << i18;
            }
        }
        int[] iArr2 = new int[6];
        for (int i19 = 0; i19 < 6; i19++) {
            iArr2[i19] = s02.i(8);
        }
        int i20 = s02.i(8);
        int i21 = 0;
        for (int i22 = 0; i22 < i14; i22++) {
            if (s02.h()) {
                i21 += 89;
            }
            if (s02.h()) {
                i21 += 8;
            }
        }
        s02.t(i21);
        if (i14 > 0) {
            s02.t((8 - i14) * 2);
        }
        s02.m();
        int m = s02.m();
        if (m == 3) {
            s02.s();
        }
        int m2 = s02.m();
        int m3 = s02.m();
        if (s02.h()) {
            int m4 = s02.m();
            int m5 = s02.m();
            int m6 = s02.m();
            int m7 = s02.m();
            m2 -= (m4 + m5) * ((m == 1 || m == 2) ? 2 : 1);
            m3 -= (m6 + m7) * (m == 1 ? 2 : 1);
        }
        int i23 = m3;
        int i24 = m2;
        int m8 = s02.m();
        int m9 = s02.m();
        int m10 = s02.m();
        int i25 = -1;
        int i26 = -1;
        for (int i27 = s02.h() ? 0 : i14; i27 <= i14; i27++) {
            s02.m();
            i26 = Math.max(s02.m(), i26);
            s02.m();
        }
        s02.m();
        s02.m();
        s02.m();
        s02.m();
        s02.m();
        s02.m();
        if (s02.h() && s02.h()) {
            int i28 = 0;
            while (i28 < i13) {
                int i29 = 0;
                while (i29 < 6) {
                    if (!s02.h()) {
                        s02.m();
                    } else {
                        int min = Math.min(64, 1 << ((i28 << 1) + i13));
                        if (i28 > 1) {
                            s02.n();
                        }
                        for (int i30 = 0; i30 < min; i30++) {
                            s02.n();
                        }
                    }
                    i29 += i28 == 3 ? 3 : 1;
                    i13 = 4;
                }
                i28++;
                i13 = 4;
            }
        }
        s02.t(2);
        if (s02.h()) {
            s02.t(8);
            s02.m();
            s02.m();
            s02.s();
        }
        int m11 = s02.m();
        int[] iArr3 = new int[0];
        int[] iArr4 = new int[0];
        int i31 = 0;
        int i32 = -1;
        int i33 = -1;
        while (i31 < m11) {
            if (i31 == 0 || !s02.h()) {
                i11 = m11;
                i7 = i16;
                i8 = i17;
                iArr = iArr2;
                i9 = i20;
                i10 = i26;
                int m12 = s02.m();
                int m13 = s02.m();
                iArr3 = new int[m12];
                int i34 = 0;
                while (i34 < m12) {
                    iArr3[i34] = (i34 > 0 ? iArr3[i34 - 1] : 0) - (s02.m() + 1);
                    s02.s();
                    i34++;
                }
                iArr4 = new int[m13];
                int i35 = 0;
                while (i35 < m13) {
                    iArr4[i35] = s02.m() + 1 + (i35 > 0 ? iArr4[i35 - 1] : 0);
                    s02.s();
                    i35++;
                }
                int i36 = m13;
                i32 = m12;
                i12 = i36;
            } else {
                i11 = m11;
                int i37 = i32 + i33;
                int m14 = (1 - ((s02.h() ? 1 : 0) * true)) * (s02.m() + 1);
                i10 = i26;
                int i38 = i37 + 1;
                i9 = i20;
                boolean[] zArr = new boolean[i38];
                iArr = iArr2;
                for (int i39 = 0; i39 <= i37; i39++) {
                    if (!s02.h()) {
                        zArr[i39] = s02.h();
                    } else {
                        zArr[i39] = true;
                    }
                }
                int[] iArr5 = new int[i38];
                int[] iArr6 = new int[i38];
                int i40 = 0;
                for (int i41 = i33 - 1; i41 >= 0; i41--) {
                    int i42 = iArr4[i41] + m14;
                    if (i42 < 0 && zArr[i32 + i41]) {
                        iArr5[i40] = i42;
                        i40++;
                    }
                }
                if (m14 < 0 && zArr[i37]) {
                    iArr5[i40] = m14;
                    i40++;
                }
                i8 = i17;
                int i43 = i40;
                i7 = i16;
                for (int i44 = 0; i44 < i32; i44++) {
                    int i45 = iArr3[i44] + m14;
                    if (i45 < 0 && zArr[i44]) {
                        iArr5[i43] = i45;
                        i43++;
                    }
                }
                int[] copyOf = Arrays.copyOf(iArr5, i43);
                int i46 = 0;
                for (int i47 = i32 - 1; i47 >= 0; i47--) {
                    int i48 = iArr3[i47] + m14;
                    if (i48 > 0 && zArr[i47]) {
                        iArr6[i46] = i48;
                        i46++;
                    }
                }
                if (m14 > 0 && zArr[i37]) {
                    iArr6[i46] = m14;
                    i46++;
                }
                i12 = i46;
                for (int i49 = 0; i49 < i33; i49++) {
                    int i50 = iArr4[i49] + m14;
                    if (i50 > 0 && zArr[i32 + i49]) {
                        iArr6[i12] = i50;
                        i12++;
                    }
                }
                iArr4 = Arrays.copyOf(iArr6, i12);
                iArr3 = copyOf;
                i32 = i43;
            }
            i31++;
            i33 = i12;
            m11 = i11;
            i26 = i10;
            i20 = i9;
            iArr2 = iArr;
            i17 = i8;
            i16 = i7;
        }
        int i51 = i16;
        int i52 = i17;
        int[] iArr7 = iArr2;
        int i53 = i20;
        int i54 = i26;
        if (s02.h()) {
            int m15 = s02.m();
            for (int i55 = 0; i55 < m15; i55++) {
                s02.t(m10 + 5);
            }
        }
        int i56 = 2;
        s02.t(2);
        float f2 = 1.0f;
        if (s02.h()) {
            if (s02.h()) {
                int i57 = s02.i(8);
                if (i57 == 255) {
                    int i58 = s02.i(16);
                    int i59 = s02.i(16);
                    if (!(i58 == 0 || i59 == 0)) {
                        f2 = ((float) i58) / ((float) i59);
                    }
                } else if (i57 < 17) {
                    f2 = f[i57];
                } else {
                    ey8.k(i57, "Unexpected aspect_ratio_idc value: ");
                }
            }
            if (s02.h()) {
                s02.s();
            }
            if (s02.h()) {
                s02.t(3);
                if (s02.h()) {
                    i56 = 1;
                }
                if (s02.h()) {
                    int i60 = s02.i(8);
                    int i61 = s02.i(8);
                    s02.t(8);
                    i25 = i63.h(i60);
                    i6 = i63.i(i61);
                } else {
                    i6 = -1;
                }
            } else {
                i56 = -1;
                i6 = -1;
            }
            if (s02.h()) {
                s02.m();
                s02.m();
            }
            s02.s();
            if (s02.h()) {
                i23 *= 2;
            }
            i4 = i56;
            i5 = i23;
        } else {
            i5 = i23;
            i6 = -1;
            i4 = -1;
        }
        return new xl9(i15, h2, i51, i52, m8, m9, iArr7, i53, i24, i5, f2, i54, i25, i4, i6);
    }

    /* JADX WARNING: Removed duplicated region for block: B:134:0x025a  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0185  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.bm9 K(int r30, byte[] r31, int r32) {
        /*
            r0 = 1
            int r1 = r30 + 1
            s02 r2 = new s02
            r3 = 4
            r4 = r31
            r5 = r32
            r2.<init>((int) r1, (int) r5, (int) r3, (byte[]) r4)
            r1 = 8
            int r4 = r2.i(r1)
            int r5 = r2.i(r1)
            int r6 = r2.i(r1)
            int r7 = r2.m()
            r3 = 16
            r8 = 86
            r9 = 44
            r10 = 244(0xf4, float:3.42E-43)
            r11 = 122(0x7a, float:1.71E-43)
            r12 = 110(0x6e, float:1.54E-43)
            r13 = 100
            r14 = 3
            if (r4 == r13) goto L_0x0051
            if (r4 == r12) goto L_0x0051
            if (r4 == r11) goto L_0x0051
            if (r4 == r10) goto L_0x0051
            if (r4 == r9) goto L_0x0051
            r15 = 83
            if (r4 == r15) goto L_0x0051
            if (r4 == r8) goto L_0x0051
            r15 = 118(0x76, float:1.65E-43)
            if (r4 == r15) goto L_0x0051
            r15 = 128(0x80, float:1.794E-43)
            if (r4 == r15) goto L_0x0051
            r15 = 138(0x8a, float:1.93E-43)
            if (r4 != r15) goto L_0x004b
            goto L_0x0051
        L_0x004b:
            r15 = r0
            r11 = 0
            r12 = 0
            r13 = 0
            goto L_0x00b4
        L_0x0051:
            int r15 = r2.m()
            if (r15 != r14) goto L_0x005c
            boolean r16 = r2.h()
            goto L_0x005e
        L_0x005c:
            r16 = 0
        L_0x005e:
            int r17 = r2.m()
            int r18 = r2.m()
            r2.s()
            boolean r19 = r2.h()
            if (r19 == 0) goto L_0x00ae
            if (r15 == r14) goto L_0x0072
            goto L_0x0076
        L_0x0072:
            r19 = 12
            r1 = r19
        L_0x0076:
            r10 = 0
        L_0x0077:
            if (r10 >= r1) goto L_0x00ae
            boolean r19 = r2.h()
            if (r19 == 0) goto L_0x00a5
            r11 = 6
            if (r10 >= r11) goto L_0x0084
            r11 = r3
            goto L_0x0086
        L_0x0084:
            r11 = 64
        L_0x0086:
            r12 = 0
            r20 = 8
            r21 = 8
        L_0x008b:
            if (r12 >= r11) goto L_0x00a5
            if (r20 == 0) goto L_0x009b
            int r20 = r2.n()
            int r13 = r20 + r21
            int r13 = r13 + 256
            int r13 = r13 % 256
            r20 = r13
        L_0x009b:
            if (r20 != 0) goto L_0x009e
            goto L_0x00a0
        L_0x009e:
            r21 = r20
        L_0x00a0:
            int r12 = r12 + 1
            r13 = 100
            goto L_0x008b
        L_0x00a5:
            int r10 = r10 + 1
            r11 = 122(0x7a, float:1.71E-43)
            r12 = 110(0x6e, float:1.54E-43)
            r13 = 100
            goto L_0x0077
        L_0x00ae:
            r13 = r16
            r11 = r17
            r12 = r18
        L_0x00b4:
            int r1 = r2.m()
            int r1 = r1 + 4
            int r10 = r2.m()
            if (r10 != 0) goto L_0x00cf
            int r16 = r2.m()
            int r16 = r16 + 4
            r20 = r10
            r23 = r15
            r24 = r16
        L_0x00cc:
            r25 = 0
            goto L_0x00fc
        L_0x00cf:
            if (r10 != r0) goto L_0x00f5
            boolean r16 = r2.h()
            r2.n()
            r2.n()
            int r8 = r2.m()
            r20 = r10
            long r9 = (long) r8
            r23 = r15
            r8 = 0
        L_0x00e5:
            long r14 = (long) r8
            int r14 = (r14 > r9 ? 1 : (r14 == r9 ? 0 : -1))
            if (r14 >= 0) goto L_0x00f0
            r2.m()
            int r8 = r8 + 1
            goto L_0x00e5
        L_0x00f0:
            r25 = r16
            r24 = 0
            goto L_0x00fc
        L_0x00f5:
            r20 = r10
            r23 = r15
            r24 = 0
            goto L_0x00cc
        L_0x00fc:
            r2.m()
            r2.s()
            int r8 = r2.m()
            int r8 = r8 + r0
            int r9 = r2.m()
            int r9 = r9 + r0
            boolean r14 = r2.h()
            int r10 = 2 - r14
            int r9 = r9 * r10
            if (r14 != 0) goto L_0x0118
            r2.s()
        L_0x0118:
            r2.s()
            int r8 = r8 * r3
            int r9 = r9 * r3
            boolean r15 = r2.h()
            r16 = 2
            if (r15 == 0) goto L_0x015c
            int r15 = r2.m()
            int r26 = r2.m()
            int r27 = r2.m()
            int r28 = r2.m()
            if (r23 != 0) goto L_0x013b
            r3 = r0
            r29 = r3
            goto L_0x014e
        L_0x013b:
            r0 = r23
            r3 = 3
            if (r0 != r3) goto L_0x0144
            r3 = 1
            r29 = 1
            goto L_0x0147
        L_0x0144:
            r29 = r16
            r3 = 1
        L_0x0147:
            if (r0 != r3) goto L_0x014c
            r0 = r16
            goto L_0x014d
        L_0x014c:
            r0 = r3
        L_0x014d:
            int r10 = r10 * r0
        L_0x014e:
            int r15 = r15 + r26
            int r15 = r15 * r29
            int r8 = r8 - r15
            int r27 = r27 + r28
            int r27 = r27 * r10
            int r9 = r9 - r27
        L_0x0159:
            r0 = 44
            goto L_0x015e
        L_0x015c:
            r3 = r0
            goto L_0x0159
        L_0x015e:
            if (r4 == r0) goto L_0x0174
            r0 = 86
            if (r4 == r0) goto L_0x0174
            r0 = 100
            if (r4 == r0) goto L_0x0174
            r0 = 110(0x6e, float:1.54E-43)
            if (r4 == r0) goto L_0x0174
            r0 = 122(0x7a, float:1.71E-43)
            if (r4 == r0) goto L_0x0174
            r0 = 244(0xf4, float:3.42E-43)
            if (r4 != r0) goto L_0x017a
        L_0x0174:
            r0 = r5 & 16
            if (r0 == 0) goto L_0x017a
            r15 = 0
            goto L_0x017c
        L_0x017a:
            r15 = 16
        L_0x017c:
            boolean r0 = r2.h()
            r10 = -1
            r17 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L_0x025a
            boolean r0 = r2.h()
            if (r0 == 0) goto L_0x01b6
            r0 = 8
            int r3 = r2.i(r0)
            r0 = 255(0xff, float:3.57E-43)
            if (r3 != r0) goto L_0x01a8
            r0 = 16
            int r3 = r2.i(r0)
            int r0 = r2.i(r0)
            if (r3 == 0) goto L_0x01b6
            if (r0 == 0) goto L_0x01b6
            float r3 = (float) r3
            float r0 = (float) r0
            float r17 = r3 / r0
            goto L_0x01b6
        L_0x01a8:
            r0 = 17
            if (r3 >= r0) goto L_0x01b1
            float[] r0 = f
            r17 = r0[r3]
            goto L_0x01b6
        L_0x01b1:
            java.lang.String r0 = "Unexpected aspect_ratio_idc value: "
            defpackage.ey8.k(r3, r0)
        L_0x01b6:
            boolean r0 = r2.h()
            if (r0 == 0) goto L_0x01bf
            r2.s()
        L_0x01bf:
            boolean r0 = r2.h()
            if (r0 == 0) goto L_0x01f1
            r0 = 3
            r2.t(r0)
            boolean r0 = r2.h()
            if (r0 == 0) goto L_0x01d1
            r0 = 1
            goto L_0x01d3
        L_0x01d1:
            r0 = r16
        L_0x01d3:
            boolean r3 = r2.h()
            if (r3 == 0) goto L_0x01ef
            r3 = 8
            int r10 = r2.i(r3)
            int r16 = r2.i(r3)
            r2.t(r3)
            int r10 = defpackage.i63.h(r10)
            int r3 = defpackage.i63.i(r16)
            goto L_0x01f3
        L_0x01ef:
            r3 = r10
            goto L_0x01f3
        L_0x01f1:
            r0 = r10
            r3 = r0
        L_0x01f3:
            boolean r16 = r2.h()
            if (r16 == 0) goto L_0x01ff
            r2.m()
            r2.m()
        L_0x01ff:
            boolean r16 = r2.h()
            r30 = r0
            if (r16 == 0) goto L_0x020c
            r0 = 65
            r2.t(r0)
        L_0x020c:
            boolean r0 = r2.h()
            if (r0 == 0) goto L_0x0215
            O(r2)
        L_0x0215:
            boolean r16 = r2.h()
            if (r16 == 0) goto L_0x021e
            O(r2)
        L_0x021e:
            if (r0 != 0) goto L_0x0222
            if (r16 == 0) goto L_0x0225
        L_0x0222:
            r2.s()
        L_0x0225:
            r2.s()
            boolean r0 = r2.h()
            if (r0 == 0) goto L_0x024f
            r2.s()
            r2.m()
            r2.m()
            r2.m()
            r2.m()
            int r0 = r2.m()
            r2.m()
            r22 = r0
            r21 = r3
            r19 = r10
            r10 = r17
            r0 = r30
            goto L_0x0260
        L_0x024f:
            r0 = r30
            r21 = r3
            r19 = r10
        L_0x0255:
            r22 = r15
            r10 = r17
            goto L_0x0260
        L_0x025a:
            r0 = r10
            r19 = r0
            r21 = r19
            goto L_0x0255
        L_0x0260:
            bm9 r2 = new bm9
            r3 = r2
            r16 = r20
            r15 = r1
            r17 = r24
            r18 = r25
            r20 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fm9.K(int, byte[], int):bm9");
    }

    public static bdb L(byte[] bArr) {
        byte[] bArr2 = b.a;
        try {
            Protos.SelfProfile parseFrom = Protos.SelfProfile.parseFrom(bArr);
            HashMap hashMap = new HashMap();
            Map<Integer, Protos.RestrictionsInfo> map = parseFrom.restrictions;
            if (map != null && !map.isEmpty()) {
                for (Integer next : parseFrom.restrictions.keySet()) {
                    hashMap.put(next, new jjc(parseFrom.restrictions.get(next).expiration));
                }
            }
            ArrayList arrayList = new ArrayList();
            int[] iArr = parseFrom.profileOptions;
            if (iArr != null && iArr.length >= 1) {
                int i2 = 0;
                while (true) {
                    int[] iArr2 = parseFrom.profileOptions;
                    if (i2 >= iArr2.length) {
                        break;
                    }
                    arrayList.add(Integer.valueOf(iArr2[i2]));
                    i2++;
                }
            }
            return new bdb((Object) hashMap, 0, (Object) arrayList);
        } catch (InvalidProtocolBufferNanoException e2) {
            throw new IOException(e2);
        }
    }

    public static void M(Context context, String str, s08 s08, boolean z) {
        khe khe = sme.a0;
        sme R = R(context);
        View inflate = z ? LayoutInflater.from(context).inflate(yyb.dialog_progress_with_text, (ViewGroup) null) : LayoutInflater.from(context).inflate(yyb.dialog_progress_horizontal, (ViewGroup) null);
        if (z) {
            AppCompatTextView appCompatTextView = (AppCompatTextView) inflate.findViewById(xxb.dialog_progress__text);
            if (appCompatTextView != null) {
                appCompatTextView.setText(str);
                appCompatTextView.setTextColor(R.J);
                appCompatTextView.setTextSize(13.0f);
            }
        } else {
            s08.a.f = str;
        }
        ProgressBar progressBar = (ProgressBar) inflate.findViewById(xxb.dialog_progress__progress);
        if (progressBar != null) {
            progressBar.setIndeterminate(z);
            progressBar.setMax(100);
            ngg.H(progressBar, R.k);
        }
        s08.f(inflate);
    }

    public static void N(Widget widget) {
        bc7[] bc7Arr = BottomSheetWidget.x0;
        znc znc = null;
        lg3 e2 = wg0.e(v0c.oneme_login_sms_count_exceeded_title, 6, (Bundle) null);
        e2.f(new eqe(v0c.oneme_login_sms_count_exceeded_description));
        e2.d(hwb.oneme_login_sms_code_exceeded_ok_btn, new eqe(jpc.k0));
        ConfirmationBottomSheet e3 = e2.e();
        e3.setTargetController(widget);
        uu3 uu3 = widget;
        while (uu3.getParentController() != null) {
            uu3 = uu3.getParentController();
        }
        foc foc = uu3 instanceof foc ? (foc) uu3 : null;
        if (foc != null) {
            znc = foc.T();
        }
        e3.z0(widget);
        if (znc != null) {
            coc coc = new coc(e3, (String) null, (zu3) null, (zu3) null, false, -1);
            wg0.l(false, coc, true, "BottomSheetWidget");
            znc.G(coc);
        }
    }

    public static void O(s02 s02) {
        int m = s02.m() + 1;
        s02.t(8);
        for (int i2 = 0; i2 < m; i2++) {
            s02.m();
            s02.m();
            s02.s();
        }
        s02.t(20);
    }

    public static byte[] P(yv0 yv0) {
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int min = Math.min(8192, Math.max(128, Integer.highestOneBit(0) * 2));
        int i2 = 0;
        while (i2 < 2147483639) {
            int min2 = Math.min(min, 2147483639 - i2);
            byte[] bArr = new byte[min2];
            arrayDeque.add(bArr);
            int i3 = 0;
            while (i3 < min2) {
                int read = yv0.read(bArr, i3, min2 - i3);
                if (read == -1) {
                    return o(arrayDeque, i2);
                }
                i3 += read;
                i2 += read;
            }
            long j = ((long) min) * ((long) (min < 4096 ? 4 : 2));
            min = j > 2147483647L ? Integer.MAX_VALUE : j < -2147483648L ? Integer.MIN_VALUE : (int) j;
        }
        if (yv0.read() == -1) {
            return o(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    public static int Q(int i2, byte[] bArr) {
        int i3;
        synchronized (g) {
            int i4 = 0;
            int i5 = 0;
            while (i4 < i2) {
                while (true) {
                    if (i4 >= i2 - 2) {
                        i4 = i2;
                        break;
                    }
                    try {
                        if (bArr[i4] == 0 && bArr[i4 + 1] == 0 && bArr[i4 + 2] == 3) {
                            break;
                        }
                        i4++;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i4 < i2) {
                    int[] iArr = h;
                    if (iArr.length <= i5) {
                        h = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    h[i5] = i4;
                    i4 += 3;
                    i5++;
                }
            }
            i3 = i2 - i5;
            int i6 = 0;
            int i7 = 0;
            for (int i8 = 0; i8 < i5; i8++) {
                int i9 = h[i8] - i7;
                System.arraycopy(bArr, i7, bArr, i6, i9);
                int i10 = i6 + i9;
                int i11 = i10 + 1;
                bArr[i10] = 0;
                i6 = i10 + 2;
                bArr[i11] = 0;
                i7 += i9 + 3;
            }
            System.arraycopy(bArr, i7, bArr, i6, i3 - i6);
        }
        return i3;
    }

    public static sme R(Context context) {
        Object obj;
        while (!(context instanceof ase)) {
            if (context instanceof ContextWrapper) {
                context = ((ContextWrapper) context).getBaseContext();
            } else {
                try {
                    ase ase = sme.b0;
                    if (ase == null) {
                        ase = null;
                    }
                    obj = ase.u();
                } catch (Throwable th) {
                    obj = new njc(th);
                }
                if (pjc.a(obj) != null) {
                    obj = ee4.e0;
                }
                return (sme) obj;
            }
        }
        return ((ase) context).u();
    }

    public static void b(bm7 bm7, z66 z66, Executor executor) {
        bm7.d(new h76(bm7, 0, z66), executor);
    }

    public static void c(String str, Throwable th) {
        String str2;
        if (th != null) {
            Throwable th2 = th;
            while (true) {
                if (th2 == null) {
                    str2 = Log.getStackTraceString(th).trim().replace("\t", "    ");
                    break;
                } else if (th2 instanceof UnknownHostException) {
                    str2 = "UnknownHostException (no network)";
                    break;
                } else {
                    th2 = th2.getCause();
                }
            }
        } else {
            str2 = null;
        }
        if (!TextUtils.isEmpty(str2)) {
            String valueOf = String.valueOf(str);
            new StringBuilder(rh4.e(valueOf.length() + 4, str2.replace("\n", "\n  ")));
        }
    }

    public static final Object d(iv6 iv6, wv6 wv6, long j, Object obj, hu3 hu3) {
        cf5 cf5 = new cf5(iv6.a(wv6, obj), (Continuation) null);
        return j == Long.MAX_VALUE ? j1e.k(new ze5(cf5, (Continuation) null), hu3) : fp3.I(j, cf5, hu3);
    }

    public static void e(Object obj, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void f(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void g(int i2, int i3) {
        if (i2 < 0 || i2 >= i3) {
            throw new IndexOutOfBoundsException();
        }
    }

    public static void h(Object obj) {
        obj.getClass();
    }

    public static void i(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void j(Object obj, boolean z) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static void k(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void l(Object obj) {
        if (obj == null) {
            throw new IllegalStateException();
        }
    }

    public static void m(Object obj, String str) {
        if (obj == null) {
            throw new IllegalStateException(String.valueOf(str));
        }
    }

    public static void n(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static byte[] o(ArrayDeque arrayDeque, int i2) {
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        if (bArr.length == i2) {
            return bArr;
        }
        int length = i2 - bArr.length;
        byte[] copyOf = Arrays.copyOf(bArr, i2);
        while (length > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int min = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, copyOf, i2 - length, min);
            length -= min;
        }
        return copyOf;
    }

    public static final boolean p(long j, List list) {
        if (list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            i13 i13 = (i13) it.next();
            if (i13.a() <= j && j <= i13.b()) {
                return true;
            }
        }
        return false;
    }

    public static int q(String str, int i2, int i3, boolean z) {
        while (i2 < i3) {
            char charAt = str.charAt(i2);
            if (((charAt < ' ' && charAt != 9) || charAt >= 127 || ('0' <= charAt && '9' >= charAt) || (('a' <= charAt && 'z' >= charAt) || (('A' <= charAt && 'Z' >= charAt) || charAt == ':'))) == (!z)) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static void r(IllegalArgumentException illegalArgumentException) {
        c("", illegalArgumentException);
    }

    public static synchronized void s() {
        synchronized (fm9.class) {
            if (!a) {
                hm9.M("native-imagetranscoder");
                a = true;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: hu3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: ye5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: hu3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: ye5} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object t(defpackage.iv6 r8, defpackage.wv6 r9, long r10, java.lang.Object r12, boolean r13, kotlin.coroutines.Continuation r14) {
        /*
            boolean r0 = r14 instanceof defpackage.ye5
            if (r0 == 0) goto L_0x0014
            r0 = r14
            ye5 r0 = (defpackage.ye5) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0014
            int r1 = r1 - r2
            r0.Z = r1
        L_0x0012:
            r6 = r0
            goto L_0x001a
        L_0x0014:
            ye5 r0 = new ye5
            r0.<init>(r14)
            goto L_0x0012
        L_0x001a:
            java.lang.Object r14 = r6.Y
            tx3 r0 = defpackage.tx3.a
            int r1 = r6.Z
            r7 = 1
            if (r1 == 0) goto L_0x0035
            if (r1 != r7) goto L_0x002d
            boolean r13 = r6.X
            wv6 r9 = r6.o
            defpackage.od2.a0(r14)
            goto L_0x0049
        L_0x002d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0035:
            defpackage.od2.a0(r14)
            r6.o = r9
            r6.X = r13
            r6.Z = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r5 = r12
            java.lang.Object r14 = d(r1, r2, r3, r5, r6)
            if (r14 != r0) goto L_0x0049
            return r0
        L_0x0049:
            o43 r14 = (defpackage.o43) r14
            r8 = 0
            if (r14 != 0) goto L_0x004f
            return r8
        L_0x004f:
            java.lang.Object r10 = r14.e0()
            l43 r10 = (defpackage.l43) r10
            boolean r11 = r10 instanceof com.facebook.imagepipeline.image.CloseableStaticBitmap
            r12 = 0
            if (r11 == 0) goto L_0x0061
            com.facebook.imagepipeline.image.CloseableStaticBitmap r10 = (com.facebook.imagepipeline.image.CloseableStaticBitmap) r10
            android.graphics.Bitmap r9 = r10.getUnderlyingBitmap()
            goto L_0x0083
        L_0x0061:
            boolean r11 = r10 instanceof defpackage.p43
            if (r11 == 0) goto L_0x0093
            p43 r10 = (defpackage.p43) r10
            android.graphics.drawable.Drawable r10 = r10.J()
            if (r10 == 0) goto L_0x0081
            jic r9 = r9.i
            r11 = 200(0xc8, float:2.8E-43)
            if (r9 == 0) goto L_0x0076
            int r14 = r9.a
            goto L_0x0077
        L_0x0076:
            r14 = r11
        L_0x0077:
            if (r9 == 0) goto L_0x007b
            int r11 = r9.b
        L_0x007b:
            android.graphics.Bitmap r9 = defpackage.f8.B(r10, r14, r11)
        L_0x007f:
            r7 = r12
            goto L_0x0083
        L_0x0081:
            r9 = r8
            goto L_0x007f
        L_0x0083:
            if (r13 == 0) goto L_0x0092
            if (r7 == 0) goto L_0x0092
            if (r9 == 0) goto L_0x0091
            android.graphics.Bitmap$Config r8 = r9.getConfig()
            android.graphics.Bitmap r8 = r9.copy(r8, r12)
        L_0x0091:
            return r8
        L_0x0092:
            return r9
        L_0x0093:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fm9.t(iv6, wv6, long, java.lang.Object, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ Object u(iv6 iv6, wv6 wv6, long j, Object obj, Continuation continuation, int i2) {
        if ((i2 & 2) != 0) {
            j = Long.MAX_VALUE;
        }
        long j2 = j;
        if ((i2 & 4) != 0) {
            obj = null;
        }
        return t(iv6, wv6, j2, obj, true, continuation);
    }

    public static final i13 v(long j, List list) {
        Object obj;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            i13 i13 = (i13) obj;
            if (i13.a() <= j && j <= i13.b()) {
                break;
            }
        }
        return (i13) obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: i13} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final defpackage.i13 w(long r5, java.util.List r7) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r7 = r7.iterator()
        L_0x0009:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x0022
            java.lang.Object r1 = r7.next()
            r2 = r1
            i13 r2 = (defpackage.i13) r2
            long r2 = r2.a()
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 <= 0) goto L_0x0009
            r0.add(r1)
            goto L_0x0009
        L_0x0022:
            java.util.Iterator r5 = r0.iterator()
            boolean r6 = r5.hasNext()
            if (r6 != 0) goto L_0x002e
            r5 = 0
            goto L_0x0059
        L_0x002e:
            java.lang.Object r6 = r5.next()
            boolean r7 = r5.hasNext()
            if (r7 != 0) goto L_0x003a
        L_0x0038:
            r5 = r6
            goto L_0x0059
        L_0x003a:
            r7 = r6
            i13 r7 = (defpackage.i13) r7
            long r0 = r7.b()
        L_0x0041:
            java.lang.Object r7 = r5.next()
            r2 = r7
            i13 r2 = (defpackage.i13) r2
            long r2 = r2.b()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x0052
            r6 = r7
            r0 = r2
        L_0x0052:
            boolean r7 = r5.hasNext()
            if (r7 != 0) goto L_0x0041
            goto L_0x0038
        L_0x0059:
            i13 r5 = (defpackage.i13) r5
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fm9.w(long, java.util.List):i13");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: i13} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final defpackage.i13 x(long r5, java.util.List r7) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r7 = r7.iterator()
        L_0x0009:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x0022
            java.lang.Object r1 = r7.next()
            r2 = r1
            i13 r2 = (defpackage.i13) r2
            long r2 = r2.b()
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 >= 0) goto L_0x0009
            r0.add(r1)
            goto L_0x0009
        L_0x0022:
            java.util.Iterator r5 = r0.iterator()
            boolean r6 = r5.hasNext()
            if (r6 != 0) goto L_0x002e
            r5 = 0
            goto L_0x0059
        L_0x002e:
            java.lang.Object r6 = r5.next()
            boolean r7 = r5.hasNext()
            if (r7 != 0) goto L_0x003a
        L_0x0038:
            r5 = r6
            goto L_0x0059
        L_0x003a:
            r7 = r6
            i13 r7 = (defpackage.i13) r7
            long r0 = r7.b()
        L_0x0041:
            java.lang.Object r7 = r5.next()
            r2 = r7
            i13 r2 = (defpackage.i13) r2
            long r2 = r2.b()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x0052
            r6 = r7
            r0 = r2
        L_0x0052:
            boolean r7 = r5.hasNext()
            if (r7 != 0) goto L_0x0041
            goto L_0x0038
        L_0x0059:
            i13 r5 = (defpackage.i13) r5
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fm9.x(long, java.util.List):i13");
    }

    public static int y(byte[] bArr, int i2, int i3, boolean[] zArr) {
        int i4 = i3 - i2;
        boolean z = false;
        k(i4 >= 0);
        if (i4 == 0) {
            return i3;
        }
        if (zArr[0]) {
            n(zArr);
            return i2 - 3;
        } else if (i4 > 1 && zArr[1] && bArr[i2] == 1) {
            n(zArr);
            return i2 - 2;
        } else if (i4 <= 2 || !zArr[2] || bArr[i2] != 0 || bArr[i2 + 1] != 1) {
            int i5 = i3 - 1;
            int i6 = i2 + 2;
            while (i6 < i5) {
                byte b2 = bArr[i6];
                if ((b2 & 254) == 0) {
                    int i7 = i6 - 2;
                    if (bArr[i7] == 0 && bArr[i6 - 1] == 0 && b2 == 1) {
                        n(zArr);
                        return i7;
                    }
                    i6 -= 2;
                }
                i6 += 3;
            }
            zArr[0] = i4 <= 2 ? !(i4 != 2 ? !zArr[1] || bArr[i5] != 1 : !(zArr[2] && bArr[i3 + -2] == 0 && bArr[i5] == 1)) : bArr[i3 + -3] == 0 && bArr[i3 + -2] == 0 && bArr[i5] == 1;
            zArr[1] = i4 <= 1 ? !(!zArr[2] || bArr[i5] != 0) : bArr[i3 + -2] == 0 && bArr[i5] == 0;
            if (bArr[i5] == 0) {
                z = true;
            }
            zArr[2] = z;
            return i3;
        } else {
            n(zArr);
            return i2 - 1;
        }
    }

    public static final void z(ViewPager2 viewPager2) {
        RecyclerView recyclerView = (RecyclerView) l6d.c0(l6d.Z(new at(7, viewPager2), n71.z0));
        if (recyclerView != null) {
            recyclerView.setId(xoc.W0);
        }
    }

    public abstract void E(Matrix matrix, Rect rect, int i2, int i3, float f2, float f3, float f4, float f5);

    public abstract Rect H();

    public Matrix a(Matrix matrix, Rect rect, int i2, int i3, float f2, float f3) {
        int i4 = i2;
        int i5 = i3;
        E(matrix, rect, i4, i5, f2, f3, ((float) rect.width()) / ((float) i4), ((float) rect.height()) / ((float) i5));
        return matrix;
    }
}
