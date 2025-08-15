package defpackage;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.media3.common.ParserException;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.Reader;
import java.io.StringWriter;
import java.math.RoundingMode;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlin.coroutines.Continuation;
import org.apache.http.HttpStatus;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: m6d  reason: default package */
public abstract class m6d {
    public static final o97 a = new o97("CRASH_REPORT", 1);
    public static final byte[] b = {112, 114, 111, 0};
    public static final byte[] c = {112, 114, 109, 0};

    public static void A(sra[] sraArr, Path path) {
        int i;
        int i2;
        int i3;
        char c2;
        int i4;
        sra sra;
        int i5;
        char c3;
        int i6;
        int i7;
        sra sra2;
        float f;
        float f2;
        int i8;
        char c4;
        int i9;
        int i10;
        float f3;
        float f4;
        int i11;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        sra[] sraArr2 = sraArr;
        Path path2 = path;
        int i12 = 6;
        float[] fArr = new float[6];
        int length = sraArr2.length;
        int i13 = 0;
        char c5 = 'm';
        while (i13 < length) {
            sra sra3 = sraArr2[i13];
            char c6 = sra3.a;
            float f15 = fArr[0];
            float f16 = fArr[1];
            float f17 = fArr[2];
            float f18 = fArr[3];
            float f19 = fArr[4];
            float f20 = fArr[5];
            switch (c6) {
                case 'A':
                case 'a':
                    i = 7;
                    break;
                case 'C':
                case 'c':
                    i = i12;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path2.moveTo(f19, f20);
                    f15 = f19;
                    f17 = f15;
                    f16 = f20;
                    f18 = f16;
                    break;
            }
            i = 2;
            float f21 = f19;
            float f22 = f20;
            float f23 = f15;
            float f24 = f16;
            int i14 = 0;
            while (true) {
                float[] fArr2 = sra3.b;
                if (i14 < fArr2.length) {
                    if (c6 != 'A') {
                        if (c6 != 'C') {
                            if (c6 == 'H') {
                                float[] fArr3 = fArr2;
                                i2 = i14;
                                c2 = c6;
                                i3 = i13;
                                i4 = length;
                                sra = sra3;
                                path2.lineTo(fArr3[i2], f24);
                                f23 = fArr3[i2];
                            } else if (c6 == 'Q') {
                                float[] fArr4 = fArr2;
                                i8 = i14;
                                c4 = c6;
                                i9 = i13;
                                i10 = length;
                                sra = sra3;
                                int i15 = i8 + 1;
                                int i16 = i8 + 2;
                                int i17 = i8 + 3;
                                path2.quadTo(fArr4[i8], fArr4[i15], fArr4[i16], fArr4[i17]);
                                f3 = fArr4[i8];
                                f4 = fArr4[i15];
                                f23 = fArr4[i16];
                                f24 = fArr4[i17];
                            } else if (c6 == 'V') {
                                float[] fArr5 = fArr2;
                                i2 = i14;
                                c2 = c6;
                                i3 = i13;
                                i4 = length;
                                sra = sra3;
                                path2.lineTo(f23, fArr5[i2]);
                                f24 = fArr5[i2];
                            } else if (c6 != 'a') {
                                if (c6 != 'c') {
                                    if (c6 == 'h') {
                                        float[] fArr6 = fArr2;
                                        i2 = i14;
                                        float f25 = f24;
                                        path2.rLineTo(fArr6[i2], 0.0f);
                                        f23 += fArr6[i2];
                                    } else if (c6 == 'q') {
                                        float[] fArr7 = fArr2;
                                        i2 = i14;
                                        float f26 = f24;
                                        float f27 = f23;
                                        int i18 = i2 + 1;
                                        int i19 = i2 + 2;
                                        int i20 = i2 + 3;
                                        path2.rQuadTo(fArr7[i2], fArr7[i18], fArr7[i19], fArr7[i20]);
                                        float f28 = f27 + fArr7[i2];
                                        float f29 = f27 + fArr7[i19];
                                        f24 = f26 + fArr7[i20];
                                        f18 = fArr7[i18] + f26;
                                        f17 = f28;
                                        c2 = c6;
                                        i3 = i13;
                                        i4 = length;
                                        f23 = f29;
                                    } else if (c6 == 'v') {
                                        float[] fArr8 = fArr2;
                                        i2 = i14;
                                        float f30 = f23;
                                        path2.rLineTo(0.0f, fArr8[i2]);
                                        f24 += fArr8[i2];
                                    } else if (c6 != 'L') {
                                        if (c6 == 'M') {
                                            float[] fArr9 = fArr2;
                                            i2 = i14;
                                            f23 = fArr9[i2];
                                            f24 = fArr9[i2 + 1];
                                            if (i2 > 0) {
                                                path2.lineTo(f23, f24);
                                            } else {
                                                path2.moveTo(f23, f24);
                                            }
                                        } else if (c6 != 'S') {
                                            if (c6 == 'T') {
                                                float[] fArr10 = fArr2;
                                                i11 = i14;
                                                float f31 = f24;
                                                float f32 = f23;
                                                if (c5 == 'q' || c5 == 't' || c5 == 'Q' || c5 == 'T') {
                                                    f5 = (f32 * 2.0f) - f17;
                                                    f6 = (f31 * 2.0f) - f18;
                                                } else {
                                                    f5 = f32;
                                                    f6 = f31;
                                                }
                                                int i21 = i11 + 1;
                                                path2.quadTo(f5, f6, fArr10[i11], fArr10[i21]);
                                                f7 = fArr10[i11];
                                                f8 = fArr10[i21];
                                            } else if (c6 == 'l') {
                                                float[] fArr11 = fArr2;
                                                i2 = i14;
                                                int i22 = i2 + 1;
                                                path2.rLineTo(fArr11[i2], fArr11[i22]);
                                                f23 += fArr11[i2];
                                                f24 += fArr11[i22];
                                            } else if (c6 == 'm') {
                                                float[] fArr12 = fArr2;
                                                i2 = i14;
                                                float f33 = fArr12[i2];
                                                f23 += f33;
                                                float f34 = fArr12[i2 + 1];
                                                f24 += f34;
                                                if (i2 > 0) {
                                                    path2.rLineTo(f33, f34);
                                                } else {
                                                    path2.rMoveTo(f33, f34);
                                                }
                                            } else if (c6 == 's') {
                                                if (c5 == 'c' || c5 == 's' || c5 == 'C' || c5 == 'S') {
                                                    float f35 = f23 - f17;
                                                    f12 = f24 - f18;
                                                    f11 = f35;
                                                } else {
                                                    f12 = 0.0f;
                                                    f11 = 0.0f;
                                                }
                                                int i23 = i14 + 1;
                                                int i24 = i14 + 2;
                                                int i25 = i14 + 3;
                                                float[] fArr13 = fArr2;
                                                i11 = i14;
                                                float f36 = f24;
                                                float f37 = f23;
                                                path.rCubicTo(f11, f12, fArr2[i14], fArr2[i23], fArr2[i24], fArr2[i25]);
                                                f5 = f37 + fArr13[i11];
                                                f6 = f36 + fArr13[i23];
                                                f7 = f37 + fArr13[i24];
                                                f8 = fArr13[i25] + f36;
                                            } else if (c6 != 't') {
                                                i2 = i14;
                                            } else {
                                                if (c5 == 'q' || c5 == 't' || c5 == 'Q' || c5 == 'T') {
                                                    f13 = f23 - f17;
                                                    f14 = f24 - f18;
                                                } else {
                                                    f14 = 0;
                                                    f13 = 0;
                                                }
                                                int i26 = i14 + 1;
                                                path2.rQuadTo(f13, f14, fArr2[i14], fArr2[i26]);
                                                float f38 = f13 + f23;
                                                float f39 = f14 + f24;
                                                f23 += fArr2[i14];
                                                f24 += fArr2[i26];
                                                f18 = f39;
                                                i2 = i14;
                                                c2 = c6;
                                                i3 = i13;
                                                i4 = length;
                                                f17 = f38;
                                            }
                                            f18 = f6;
                                            f17 = f5;
                                            c2 = c6;
                                            i3 = i13;
                                            i4 = length;
                                            f23 = f7;
                                            f24 = f8;
                                        } else {
                                            float[] fArr14 = fArr2;
                                            i2 = i14;
                                            float f40 = f24;
                                            float f41 = f23;
                                            if (c5 == 'c' || c5 == 's' || c5 == 'C' || c5 == 'S') {
                                                f9 = (f40 * 2.0f) - f18;
                                                f10 = (f41 * 2.0f) - f17;
                                            } else {
                                                f10 = f41;
                                                f9 = f40;
                                            }
                                            int i27 = i2 + 1;
                                            int i28 = i2 + 2;
                                            int i29 = i2 + 3;
                                            path.cubicTo(f10, f9, fArr14[i2], fArr14[i27], fArr14[i28], fArr14[i29]);
                                            float f42 = fArr14[i2];
                                            float f43 = fArr14[i27];
                                            f23 = fArr14[i28];
                                            f24 = fArr14[i29];
                                            f18 = f43;
                                            f17 = f42;
                                        }
                                        f22 = f24;
                                        f21 = f23;
                                    } else {
                                        float[] fArr15 = fArr2;
                                        i2 = i14;
                                        int i30 = i2 + 1;
                                        path2.lineTo(fArr15[i2], fArr15[i30]);
                                        f23 = fArr15[i2];
                                        f24 = fArr15[i30];
                                    }
                                    c2 = c6;
                                    i3 = i13;
                                    i4 = length;
                                } else {
                                    float[] fArr16 = fArr2;
                                    i11 = i14;
                                    float f44 = f24;
                                    float f45 = f23;
                                    int i31 = i11 + 2;
                                    int i32 = i11 + 3;
                                    int i33 = i11 + 4;
                                    int i34 = i11 + 5;
                                    path.rCubicTo(fArr16[i11], fArr16[i11 + 1], fArr16[i31], fArr16[i32], fArr16[i33], fArr16[i34]);
                                    f5 = f45 + fArr16[i31];
                                    f6 = f44 + fArr16[i32];
                                    f7 = f45 + fArr16[i33];
                                    f8 = fArr16[i34] + f44;
                                    f18 = f6;
                                    f17 = f5;
                                    c2 = c6;
                                    i3 = i13;
                                    i4 = length;
                                    f23 = f7;
                                    f24 = f8;
                                }
                                sra = sra3;
                            } else {
                                float[] fArr17 = fArr2;
                                i5 = i14;
                                float f46 = f24;
                                float f47 = f23;
                                int i35 = i5 + 5;
                                int i36 = i5 + 6;
                                c3 = c6;
                                i7 = length;
                                sra2 = sra3;
                                i6 = i13;
                                sra.a(path, f47, f46, fArr17[i35] + f47, fArr17[i36] + f46, fArr17[i5], fArr17[i5 + 1], fArr17[i5 + 2], fArr17[i5 + 3] != 0.0f, fArr17[i5 + 4] != 0.0f);
                                f = f47 + fArr17[i35];
                                f2 = f46 + fArr17[i36];
                            }
                            i14 = i2 + i;
                            sra[] sraArr3 = sraArr;
                            sra3 = sra;
                            length = i4;
                            c5 = c2;
                            c6 = c5;
                            i13 = i3;
                        } else {
                            float[] fArr18 = fArr2;
                            i8 = i14;
                            c4 = c6;
                            i9 = i13;
                            i10 = length;
                            sra = sra3;
                            int i37 = i8 + 2;
                            int i38 = i8 + 3;
                            int i39 = i8 + 4;
                            int i40 = i8 + 5;
                            path.cubicTo(fArr18[i8], fArr18[i8 + 1], fArr18[i37], fArr18[i38], fArr18[i39], fArr18[i40]);
                            f23 = fArr18[i39];
                            f24 = fArr18[i40];
                            f3 = fArr18[i37];
                            f4 = fArr18[i38];
                        }
                        f17 = f3;
                        f18 = f4;
                        i14 = i2 + i;
                        sra[] sraArr32 = sraArr;
                        sra3 = sra;
                        length = i4;
                        c5 = c2;
                        c6 = c5;
                        i13 = i3;
                    } else {
                        float[] fArr19 = fArr2;
                        i5 = i14;
                        c3 = c6;
                        i6 = i13;
                        i7 = length;
                        sra2 = sra3;
                        int i41 = i5 + 5;
                        int i42 = i5 + 6;
                        sra.a(path, f23, f24, fArr19[i41], fArr19[i42], fArr19[i5], fArr19[i5 + 1], fArr19[i5 + 2], fArr19[i5 + 3] != 0.0f, fArr19[i5 + 4] != 0.0f);
                        f = fArr19[i41];
                        f2 = fArr19[i42];
                    }
                    f18 = f24;
                    f17 = f23;
                    i14 = i2 + i;
                    sra[] sraArr322 = sraArr;
                    sra3 = sra;
                    length = i4;
                    c5 = c2;
                    c6 = c5;
                    i13 = i3;
                } else {
                    fArr[0] = f23;
                    fArr[1] = f24;
                    fArr[2] = f17;
                    fArr[3] = f18;
                    fArr[4] = f21;
                    fArr[5] = f22;
                    c5 = sra3.a;
                    i13++;
                    sraArr2 = sraArr;
                    length = length;
                    i12 = 6;
                }
            }
        }
    }

    public static f99 B(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            int i2 = oaf.a;
            String[] split = str.split("=", 2);
            if (split.length != 2) {
                z04.c0("Failed to parse Vorbis comment: ".concat(str));
            } else if (split[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(sza.a(new wpa(Base64.decode(split[1], 0))));
                } catch (RuntimeException e) {
                    z04.d0("Failed to parse vorbis picture", e);
                }
            } else {
                arrayList.add(new zqf(split[0], split[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new f99((List) arrayList);
    }

    public static int[] C(ByteArrayInputStream byteArrayInputStream, int i) {
        int[] iArr = new int[i];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += (int) i24.z(byteArrayInputStream, 2);
            iArr[i3] = i2;
        }
        return iArr;
    }

    public static bj4[] D(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, bj4[] bj4Arr) {
        byte[] bArr3 = oag.g;
        if (Arrays.equals(bArr, bArr3)) {
            if (Arrays.equals(oag.b, bArr2)) {
                throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            } else if (Arrays.equals(bArr, bArr3)) {
                int z = (int) i24.z(fileInputStream, 1);
                byte[] y = i24.y(fileInputStream, (int) i24.z(fileInputStream, 4), (int) i24.z(fileInputStream, 4));
                if (fileInputStream.read() <= 0) {
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(y);
                    try {
                        bj4[] E = E(byteArrayInputStream, z, bj4Arr);
                        byteArrayInputStream.close();
                        return E;
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                } else {
                    throw new IllegalStateException("Content found after the end of file");
                }
            } else {
                throw new IllegalStateException("Unsupported meta version");
            }
        } else if (Arrays.equals(bArr, oag.h)) {
            int z2 = (int) i24.z(fileInputStream, 2);
            byte[] y2 = i24.y(fileInputStream, (int) i24.z(fileInputStream, 4), (int) i24.z(fileInputStream, 4));
            if (fileInputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(y2);
                try {
                    bj4[] F = F(byteArrayInputStream2, bArr2, z2, bj4Arr);
                    byteArrayInputStream2.close();
                    return F;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            } else {
                throw new IllegalStateException("Content found after the end of file");
            }
        } else {
            throw new IllegalStateException("Unsupported meta version");
        }
        throw th;
        throw th;
    }

    public static bj4[] E(ByteArrayInputStream byteArrayInputStream, int i, bj4[] bj4Arr) {
        int i2 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new bj4[0];
        }
        if (i == bj4Arr.length) {
            String[] strArr = new String[i];
            int[] iArr = new int[i];
            for (int i3 = 0; i3 < i; i3++) {
                iArr[i3] = (int) i24.z(byteArrayInputStream, 2);
                strArr[i3] = new String(i24.x(byteArrayInputStream, (int) i24.z(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            }
            while (i2 < i) {
                bj4 bj4 = bj4Arr[i2];
                if (bj4.b.equals(strArr[i2])) {
                    int i4 = iArr[i2];
                    bj4.e = i4;
                    bj4.h = C(byteArrayInputStream, i4);
                    i2++;
                } else {
                    throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
                }
            }
            return bj4Arr;
        }
        throw new IllegalStateException("Mismatched number of dex files found in metadata");
    }

    public static bj4[] F(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i, bj4[] bj4Arr) {
        if (byteArrayInputStream.available() == 0) {
            return new bj4[0];
        }
        if (i == bj4Arr.length) {
            int i2 = 0;
            while (i2 < i) {
                i24.z(byteArrayInputStream, 2);
                String str = new String(i24.x(byteArrayInputStream, (int) i24.z(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
                long z = i24.z(byteArrayInputStream, 4);
                int z2 = (int) i24.z(byteArrayInputStream, 2);
                bj4 bj4 = null;
                if (bj4Arr.length > 0) {
                    int indexOf = str.indexOf("!");
                    if (indexOf < 0) {
                        indexOf = str.indexOf(":");
                    }
                    String substring = indexOf > 0 ? str.substring(indexOf + 1) : str;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= bj4Arr.length) {
                            break;
                        } else if (bj4Arr[i3].b.equals(substring)) {
                            bj4 = bj4Arr[i3];
                            break;
                        } else {
                            i3++;
                        }
                    }
                }
                if (bj4 != null) {
                    bj4.d = z;
                    int[] C = C(byteArrayInputStream, z2);
                    if (Arrays.equals(bArr, oag.f)) {
                        bj4.e = z2;
                        bj4.h = C;
                    }
                    i2++;
                } else {
                    throw new IllegalStateException("Missing profile key: ".concat(str));
                }
            }
            return bj4Arr;
        }
        throw new IllegalStateException("Mismatched number of dex files found in metadata");
    }

    public static bj4[] G(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (Arrays.equals(bArr, oag.c)) {
            int z = (int) i24.z(fileInputStream, 1);
            byte[] y = i24.y(fileInputStream, (int) i24.z(fileInputStream, 4), (int) i24.z(fileInputStream, 4));
            if (fileInputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(y);
                try {
                    bj4[] I = I(byteArrayInputStream, str, z);
                    byteArrayInputStream.close();
                    return I;
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            } else {
                throw new IllegalStateException("Content found after the end of file");
            }
        } else {
            throw new IllegalStateException("Unsupported version");
        }
        throw th;
    }

    public static final String H(Reader reader) {
        StringWriter stringWriter = new StringWriter();
        char[] cArr = new char[8192];
        int read = reader.read(cArr);
        while (read >= 0) {
            stringWriter.write(cArr, 0, read);
            read = reader.read(cArr);
        }
        return stringWriter.toString();
    }

    public static bj4[] I(ByteArrayInputStream byteArrayInputStream, String str, int i) {
        TreeMap treeMap;
        ByteArrayInputStream byteArrayInputStream2 = byteArrayInputStream;
        int i2 = i;
        if (byteArrayInputStream.available() == 0) {
            return new bj4[0];
        }
        bj4[] bj4Arr = new bj4[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int z = (int) i24.z(byteArrayInputStream2, 2);
            String str2 = str;
            bj4Arr[i3] = new bj4(str2, new String(i24.x(byteArrayInputStream2, (int) i24.z(byteArrayInputStream2, 2)), StandardCharsets.UTF_8), i24.z(byteArrayInputStream2, 4), z, (int) i24.z(byteArrayInputStream2, 4), (int) i24.z(byteArrayInputStream2, 4), new int[z], new TreeMap());
        }
        int i4 = 0;
        while (i4 < i2) {
            bj4 bj4 = bj4Arr[i4];
            int available = byteArrayInputStream.available() - bj4.f;
            int i5 = 0;
            while (true) {
                int available2 = byteArrayInputStream.available();
                treeMap = bj4.i;
                if (available2 <= available) {
                    break;
                }
                i5 += (int) i24.z(byteArrayInputStream2, 2);
                treeMap.put(Integer.valueOf(i5), 1);
                for (int z2 = (int) i24.z(byteArrayInputStream2, 2); z2 > 0; z2--) {
                    i24.z(byteArrayInputStream2, 2);
                    int z3 = (int) i24.z(byteArrayInputStream2, 1);
                    if (!(z3 == 6 || z3 == 7)) {
                        while (z3 > 0) {
                            i24.z(byteArrayInputStream2, 1);
                            for (int z4 = (int) i24.z(byteArrayInputStream2, 1); z4 > 0; z4--) {
                                i24.z(byteArrayInputStream2, 2);
                            }
                            z3--;
                        }
                    }
                }
            }
            if (byteArrayInputStream.available() == available) {
                bj4.h = C(byteArrayInputStream2, bj4.e);
                int i6 = bj4.g;
                BitSet valueOf = BitSet.valueOf(i24.x(byteArrayInputStream2, (((i6 * 2) + 7) & -8) / 8));
                for (int i7 = 0; i7 < i6; i7++) {
                    int i8 = valueOf.get(i7) ? 2 : 0;
                    if (valueOf.get(i7 + i6)) {
                        i8 |= 4;
                    }
                    if (i8 != 0) {
                        Integer num = (Integer) treeMap.get(Integer.valueOf(i7));
                        if (num == null) {
                            num = 0;
                        }
                        treeMap.put(Integer.valueOf(i7), Integer.valueOf(i8 | num.intValue()));
                    }
                }
                i4++;
            } else {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
        }
        return bj4Arr;
    }

    public static mfe J(wpa wpa, boolean z, boolean z2) {
        if (z) {
            T(3, wpa, false);
        }
        wpa.s((int) wpa.l(), b52.c);
        long l = wpa.l();
        String[] strArr = new String[((int) l)];
        for (int i = 0; ((long) i) < l; i++) {
            strArr[i] = wpa.s((int) wpa.l(), b52.c);
        }
        if (!z2 || (wpa.u() & 1) != 0) {
            return new mfe(strArr);
        }
        throw ParserException.a((RuntimeException) null, "framing bit expected to be set");
    }

    public static final void K(File file, File file2) {
        if (!file.renameTo(file2)) {
            throw new IOException("Can't rename " + file + " to " + file2);
        }
    }

    public static long L(long j, long j2) {
        int numberOfLeadingZeros = Long.numberOfLeadingZeros(~j2) + Long.numberOfLeadingZeros(j2) + Long.numberOfLeadingZeros(~j) + Long.numberOfLeadingZeros(j);
        if (numberOfLeadingZeros > 65) {
            return j * j2;
        }
        long j3 = ((j ^ j2) >>> 63) + Long.MAX_VALUE;
        boolean z = false;
        boolean z2 = numberOfLeadingZeros < 64;
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        boolean z3 = i < 0;
        if (j2 == Long.MIN_VALUE) {
            z = true;
        }
        if (z2 || (z & z3)) {
            return j3;
        }
        long j4 = j * j2;
        return (i == 0 || j4 / j == j2) ? j4 : j3;
    }

    public static final void M(Drawable drawable, Drawable.Callback callback, b1f b1f) {
        if (drawable != null) {
            drawable.setCallback(callback);
            a1f a1f = drawable instanceof a1f ? (a1f) drawable : null;
            if (a1f != null) {
                a1f.l(b1f);
            }
        }
    }

    public static boolean N(Intent intent) {
        Bundle extras;
        if (intent == null || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction()) || (extras = intent.getExtras()) == null) {
            return false;
        }
        return "1".equals(extras.getString("google.c.a.e"));
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, mec] */
    public static final mqc O(mn5 mn5, long j) {
        ? obj = new Object();
        y77 a2 = pag.a();
        a2.H();
        obj.a = a2;
        return new mqc(new o0e(new cp5(mn5, new br((Object) obj, (Continuation) null, 15)), obj, j, (Continuation) null));
    }

    public static final JSONArray P(List list) {
        JSONArray jSONArray = new JSONArray();
        for (Object next : list) {
            if (next instanceof List) {
                next = P((List) next);
            } else if (next instanceof Map) {
                next = Q((Map) next);
            }
            jSONArray.put(next);
        }
        return jSONArray;
    }

    public static final JSONObject Q(Map map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof List) {
                value = P((List) value);
            } else if (value instanceof Map) {
                value = Q((Map) value);
            }
            jSONObject.putOpt(String.valueOf(key), value);
        }
        return jSONObject;
    }

    public static boolean R(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, bj4[] bj4Arr) {
        Throwable th;
        Throwable th2;
        Throwable th3;
        long j;
        ArrayList arrayList;
        int length;
        ByteArrayOutputStream byteArrayOutputStream2;
        Throwable th4;
        ByteArrayOutputStream byteArrayOutputStream3;
        Throwable th5;
        ByteArrayOutputStream byteArrayOutputStream4 = byteArrayOutputStream;
        byte[] bArr2 = bArr;
        bj4[] bj4Arr2 = bj4Arr;
        byte[] bArr3 = oag.b;
        int i = 0;
        if (Arrays.equals(bArr2, bArr3)) {
            ArrayList arrayList2 = new ArrayList(3);
            ArrayList arrayList3 = new ArrayList(3);
            ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
            try {
                i24.K(bj4Arr2.length, byteArrayOutputStream5);
                int i2 = 2;
                int i3 = 2;
                for (bj4 bj4 : bj4Arr2) {
                    i24.J(byteArrayOutputStream5, bj4.c, 4);
                    i24.J(byteArrayOutputStream5, bj4.d, 4);
                    i24.J(byteArrayOutputStream5, (long) bj4.g, 4);
                    String p = p(bj4.a, bj4.b, bArr3);
                    Charset charset = StandardCharsets.UTF_8;
                    int length2 = p.getBytes(charset).length;
                    i24.K(length2, byteArrayOutputStream5);
                    i3 = i3 + 14 + length2;
                    byteArrayOutputStream5.write(p.getBytes(charset));
                }
                byte[] byteArray = byteArrayOutputStream5.toByteArray();
                if (i3 == byteArray.length) {
                    e9g e9g = new e9g(1, byteArray, false);
                    byteArrayOutputStream5.close();
                    arrayList2.add(e9g);
                    ByteArrayOutputStream byteArrayOutputStream6 = new ByteArrayOutputStream();
                    int i4 = 0;
                    int i5 = 0;
                    while (i4 < bj4Arr2.length) {
                        try {
                            bj4 bj42 = bj4Arr2[i4];
                            i24.K(i4, byteArrayOutputStream6);
                            i24.K(bj42.e, byteArrayOutputStream6);
                            i5 = i5 + 4 + (bj42.e * 2);
                            int[] iArr = bj42.h;
                            int length3 = iArr.length;
                            int i6 = i;
                            while (i < length3) {
                                int i7 = iArr[i];
                                i24.K(i7 - i6, byteArrayOutputStream6);
                                i++;
                                i6 = i7;
                            }
                            i4++;
                            i = 0;
                        } catch (Throwable th6) {
                            th2.addSuppressed(th6);
                        }
                    }
                    byte[] byteArray2 = byteArrayOutputStream6.toByteArray();
                    if (i5 == byteArray2.length) {
                        e9g e9g2 = new e9g(3, byteArray2, true);
                        byteArrayOutputStream6.close();
                        arrayList2.add(e9g2);
                        ByteArrayOutputStream byteArrayOutputStream7 = new ByteArrayOutputStream();
                        int i8 = 0;
                        int i9 = 0;
                        while (i8 < bj4Arr2.length) {
                            try {
                                bj4 bj43 = bj4Arr2[i8];
                                int i10 = 0;
                                for (Map.Entry value : bj43.i.entrySet()) {
                                    i10 |= ((Integer) value.getValue()).intValue();
                                }
                                byteArrayOutputStream2 = new ByteArrayOutputStream();
                                V(byteArrayOutputStream2, bj43);
                                byte[] byteArray3 = byteArrayOutputStream2.toByteArray();
                                byteArrayOutputStream2.close();
                                byteArrayOutputStream3 = new ByteArrayOutputStream();
                                W(byteArrayOutputStream3, bj43);
                                byte[] byteArray4 = byteArrayOutputStream3.toByteArray();
                                byteArrayOutputStream3.close();
                                i24.K(i8, byteArrayOutputStream7);
                                int length4 = byteArray3.length + i2 + byteArray4.length;
                                int i11 = i9 + 6;
                                ArrayList arrayList4 = arrayList3;
                                i24.J(byteArrayOutputStream7, (long) length4, 4);
                                i24.K(i10, byteArrayOutputStream7);
                                byteArrayOutputStream7.write(byteArray3);
                                byteArrayOutputStream7.write(byteArray4);
                                i9 = i11 + length4;
                                i8++;
                                arrayList3 = arrayList4;
                                i2 = 2;
                            } catch (Throwable th7) {
                                th3.addSuppressed(th7);
                            }
                        }
                        ArrayList arrayList5 = arrayList3;
                        byte[] byteArray5 = byteArrayOutputStream7.toByteArray();
                        if (i9 == byteArray5.length) {
                            e9g e9g3 = new e9g(4, byteArray5, true);
                            byteArrayOutputStream7.close();
                            arrayList2.add(e9g3);
                            long j2 = (long) 4;
                            long size = j2 + j2 + 4 + ((long) (arrayList2.size() * 16));
                            i24.J(byteArrayOutputStream4, (long) arrayList2.size(), 4);
                            int i12 = 0;
                            while (i12 < arrayList2.size()) {
                                e9g e9g4 = (e9g) arrayList2.get(i12);
                                int i13 = e9g4.a;
                                if (i13 == 1) {
                                    j = 0;
                                } else if (i13 == 2) {
                                    j = 1;
                                } else if (i13 == 3) {
                                    j = 2;
                                } else if (i13 == 4) {
                                    j = 3;
                                } else if (i13 == 5) {
                                    j = 4;
                                } else {
                                    throw null;
                                }
                                i24.J(byteArrayOutputStream4, j, 4);
                                i24.J(byteArrayOutputStream4, size, 4);
                                boolean z = e9g4.c;
                                byte[] bArr4 = e9g4.b;
                                if (z) {
                                    byte[] i14 = i24.i(bArr4);
                                    arrayList = arrayList5;
                                    arrayList.add(i14);
                                    i24.J(byteArrayOutputStream4, (long) i14.length, 4);
                                    i24.J(byteArrayOutputStream4, (long) bArr4.length, 4);
                                    length = i14.length;
                                } else {
                                    arrayList = arrayList5;
                                    arrayList.add(bArr4);
                                    i24.J(byteArrayOutputStream4, (long) bArr4.length, 4);
                                    i24.J(byteArrayOutputStream4, 0, 4);
                                    length = bArr4.length;
                                }
                                size += (long) length;
                                i12++;
                                arrayList5 = arrayList;
                            }
                            ArrayList arrayList6 = arrayList5;
                            for (int i15 = 0; i15 < arrayList6.size(); i15++) {
                                byteArrayOutputStream4.write((byte[]) arrayList6.get(i15));
                            }
                            return true;
                        }
                        throw new IllegalStateException("Expected size " + i9 + ", does not match actual size " + byteArray5.length);
                    }
                    throw new IllegalStateException("Expected size " + i5 + ", does not match actual size " + byteArray2.length);
                }
                throw new IllegalStateException("Expected size " + i3 + ", does not match actual size " + byteArray.length);
            } catch (Throwable th8) {
                th.addSuppressed(th8);
            }
        } else {
            byte[] bArr5 = oag.c;
            if (Arrays.equals(bArr2, bArr5)) {
                byte[] g = g(bj4Arr2, bArr5);
                i24.J(byteArrayOutputStream4, (long) bj4Arr2.length, 1);
                i24.J(byteArrayOutputStream4, (long) g.length, 4);
                byte[] i16 = i24.i(g);
                i24.J(byteArrayOutputStream4, (long) i16.length, 4);
                byteArrayOutputStream4.write(i16);
                return true;
            }
            byte[] bArr6 = oag.e;
            if (Arrays.equals(bArr2, bArr6)) {
                i24.J(byteArrayOutputStream4, (long) bj4Arr2.length, 1);
                for (bj4 bj44 : bj4Arr2) {
                    String p2 = p(bj44.a, bj44.b, bArr6);
                    Charset charset2 = StandardCharsets.UTF_8;
                    i24.K(p2.getBytes(charset2).length, byteArrayOutputStream4);
                    i24.K(bj44.h.length, byteArrayOutputStream4);
                    i24.J(byteArrayOutputStream4, (long) (bj44.i.size() * 4), 4);
                    i24.J(byteArrayOutputStream4, bj44.c, 4);
                    byteArrayOutputStream4.write(p2.getBytes(charset2));
                    for (Integer intValue : bj44.i.keySet()) {
                        i24.K(intValue.intValue(), byteArrayOutputStream4);
                        i24.K(0, byteArrayOutputStream4);
                    }
                    for (int K : bj44.h) {
                        i24.K(K, byteArrayOutputStream4);
                    }
                }
                return true;
            }
            byte[] bArr7 = oag.d;
            if (Arrays.equals(bArr2, bArr7)) {
                byte[] g2 = g(bj4Arr2, bArr7);
                i24.J(byteArrayOutputStream4, (long) bj4Arr2.length, 1);
                i24.J(byteArrayOutputStream4, (long) g2.length, 4);
                byte[] i17 = i24.i(g2);
                i24.J(byteArrayOutputStream4, (long) i17.length, 4);
                byteArrayOutputStream4.write(i17);
                return true;
            }
            byte[] bArr8 = oag.f;
            if (!Arrays.equals(bArr2, bArr8)) {
                return false;
            }
            i24.K(bj4Arr2.length, byteArrayOutputStream4);
            for (bj4 bj45 : bj4Arr2) {
                String p3 = p(bj45.a, bj45.b, bArr8);
                Charset charset3 = StandardCharsets.UTF_8;
                i24.K(p3.getBytes(charset3).length, byteArrayOutputStream4);
                TreeMap treeMap = bj45.i;
                i24.K(treeMap.size(), byteArrayOutputStream4);
                i24.K(bj45.h.length, byteArrayOutputStream4);
                i24.J(byteArrayOutputStream4, bj45.c, 4);
                byteArrayOutputStream4.write(p3.getBytes(charset3));
                for (Integer intValue2 : treeMap.keySet()) {
                    i24.K(intValue2.intValue(), byteArrayOutputStream4);
                }
                for (int K2 : bj45.h) {
                    i24.K(K2, byteArrayOutputStream4);
                }
            }
            return true;
        }
        throw th2;
        throw th;
        throw th4;
        throw th5;
        throw th3;
    }

    public static final void S(y5f y5f) {
        y5f.e(jx8.class, new uza(9));
        y5f.e(l6c.class, new uza(10));
    }

    public static boolean T(int i, wpa wpa, boolean z) {
        if (wpa.a() < 7) {
            if (z) {
                return false;
            }
            throw ParserException.a((RuntimeException) null, "too short header: " + wpa.a());
        } else if (wpa.u() != i) {
            if (z) {
                return false;
            }
            throw ParserException.a((RuntimeException) null, "expected header type " + Integer.toHexString(i));
        } else if (wpa.u() == 118 && wpa.u() == 111 && wpa.u() == 114 && wpa.u() == 98 && wpa.u() == 105 && wpa.u() == 115) {
            return true;
        } else {
            if (z) {
                return false;
            }
            throw ParserException.a((RuntimeException) null, "expected characters 'vorbis'");
        }
    }

    public static void U(ByteArrayOutputStream byteArrayOutputStream, bj4 bj4, String str) {
        Charset charset = StandardCharsets.UTF_8;
        i24.K(str.getBytes(charset).length, byteArrayOutputStream);
        i24.K(bj4.e, byteArrayOutputStream);
        i24.J(byteArrayOutputStream, (long) bj4.f, 4);
        i24.J(byteArrayOutputStream, bj4.c, 4);
        i24.J(byteArrayOutputStream, (long) bj4.g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void V(ByteArrayOutputStream byteArrayOutputStream, bj4 bj4) {
        byte[] bArr = new byte[((((bj4.g * 2) + 7) & -8) / 8)];
        for (Map.Entry entry : bj4.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                int i = intValue / 8;
                bArr[i] = (byte) (bArr[i] | (1 << (intValue % 8)));
            }
            if ((intValue2 & 4) != 0) {
                int i2 = intValue + bj4.g;
                int i3 = i2 / 8;
                bArr[i3] = (byte) ((1 << (i2 % 8)) | bArr[i3]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void W(ByteArrayOutputStream byteArrayOutputStream, bj4 bj4) {
        int i = 0;
        for (Map.Entry entry : bj4.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                i24.K(intValue - i, byteArrayOutputStream);
                i24.K(0, byteArrayOutputStream);
                i = intValue;
            }
        }
    }

    public static boolean a(sra[] sraArr, sra[] sraArr2) {
        if (sraArr == null || sraArr2 == null || sraArr.length != sraArr2.length) {
            return false;
        }
        for (int i = 0; i < sraArr.length; i++) {
            sra sra = sraArr[i];
            char c2 = sra.a;
            sra sra2 = sraArr2[i];
            if (c2 != sra2.a || sra.b.length != sra2.b.length) {
                return false;
            }
        }
        return true;
    }

    public static long b(long j, long j2) {
        long j3 = j + j2;
        boolean z = false;
        boolean z2 = (j ^ j2) < 0;
        if ((j ^ j3) >= 0) {
            z = true;
        }
        if (z2 || z) {
            return j3;
        }
        throw new ArithmeticException(zr6.k(au1.k(j, "overflow: checkedAdd(", ", "), j2, ")"));
    }

    public static final void c(AutoCloseable autoCloseable, Throwable th) {
        if (autoCloseable == null) {
            return;
        }
        if (th == null) {
            autoCloseable.close();
            return;
        }
        try {
            autoCloseable.close();
        } catch (Throwable th2) {
            j47.e(th, th2);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: wz4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v12, resolved type: kre} */
    /* JADX WARNING: type inference failed for: r8v0 */
    /* JADX WARNING: type inference failed for: r1v2, types: [njc] */
    /* JADX WARNING: type inference failed for: r8v1 */
    /* JADX WARNING: type inference failed for: r8v2, types: [java.lang.Iterable] */
    /* JADX WARNING: type inference failed for: r8v7, types: [kre] */
    /* JADX WARNING: type inference failed for: r8v11 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void d(android.view.View r13, defpackage.fka r14) {
        /*
            java.lang.String r0 = "c"
            r1 = 2
            r2 = 0
            r3 = 1
            vz4 r4 = defpackage.vz4.a
            boolean r5 = r13 instanceof defpackage.kre
            if (r5 == 0) goto L_0x0012
            kre r13 = (defpackage.kre) r13
            r13.onThemeChanged(r14)
            goto L_0x0179
        L_0x0012:
            boolean r5 = r13 instanceof androidx.recyclerview.widget.RecyclerView
            if (r5 == 0) goto L_0x016a
            androidx.recyclerview.widget.RecyclerView r13 = (androidx.recyclerview.widget.RecyclerView) r13
            int r5 = r13.getItemDecorationCount()
            r6 = r2
            r7 = r6
        L_0x001e:
            r8 = 0
            if (r6 >= r5) goto L_0x005a
            int r9 = r13.getItemDecorationCount()
            if (r6 < 0) goto L_0x0040
            if (r6 >= r9) goto L_0x0040
            java.util.ArrayList r9 = r13.D0
            java.lang.Object r9 = r9.get(r6)
            ndc r9 = (defpackage.ndc) r9
            boolean r10 = r9 instanceof defpackage.kre
            if (r10 == 0) goto L_0x0038
            r8 = r9
            kre r8 = (defpackage.kre) r8
        L_0x0038:
            if (r8 == 0) goto L_0x003e
            r8.onThemeChanged(r14)
            r7 = r3
        L_0x003e:
            int r6 = r6 + r3
            goto L_0x001e
        L_0x0040:
            java.lang.IndexOutOfBoundsException r13 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r6)
            java.lang.String r0 = " is an invalid index for size "
            r14.append(r0)
            r14.append(r9)
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
        L_0x005a:
            if (r7 == 0) goto L_0x005f
            r13.Y()
        L_0x005f:
            java.lang.Class<vdc> r5 = defpackage.vdc.class
            java.lang.Class<androidx.recyclerview.widget.RecyclerView> r6 = androidx.recyclerview.widget.RecyclerView.class
            java.lang.reflect.Field r6 = r6.getDeclaredField(r0)     // Catch:{ all -> 0x0084 }
            r6.setAccessible(r3)     // Catch:{ all -> 0x0084 }
            java.lang.Object r6 = r6.get(r13)     // Catch:{ all -> 0x0084 }
            vdc r6 = (defpackage.vdc) r6     // Catch:{ all -> 0x0084 }
            java.lang.String r7 = "a"
            java.lang.reflect.Field r7 = r5.getDeclaredField(r7)     // Catch:{ all -> 0x0084 }
            r7.setAccessible(r3)     // Catch:{ all -> 0x0084 }
            java.lang.Object r7 = r7.get(r6)     // Catch:{ all -> 0x0084 }
            boolean r9 = r7 instanceof java.util.List     // Catch:{ all -> 0x0084 }
            if (r9 == 0) goto L_0x0087
            java.util.List r7 = (java.util.List) r7     // Catch:{ all -> 0x0084 }
            goto L_0x0088
        L_0x0084:
            r13 = move-exception
            goto L_0x0142
        L_0x0087:
            r7 = r8
        L_0x0088:
            nz4 r9 = defpackage.nz4.a
            if (r7 != 0) goto L_0x008d
            r7 = r9
        L_0x008d:
            java.lang.reflect.Field r0 = r5.getDeclaredField(r0)     // Catch:{ all -> 0x0084 }
            r0.setAccessible(r3)     // Catch:{ all -> 0x0084 }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ all -> 0x0084 }
            boolean r5 = r0 instanceof java.util.List     // Catch:{ all -> 0x0084 }
            if (r5 == 0) goto L_0x009f
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x0084 }
            goto L_0x00a0
        L_0x009f:
            r0 = r8
        L_0x00a0:
            if (r0 != 0) goto L_0x00a3
            goto L_0x00a4
        L_0x00a3:
            r9 = r0
        L_0x00a4:
            hdc r0 = r13.getAdapter()     // Catch:{ all -> 0x0084 }
            if (r0 == 0) goto L_0x00d5
            int r5 = r0.j()     // Catch:{ all -> 0x0084 }
            j37 r5 = defpackage.ote.Y(r2, r5)     // Catch:{ all -> 0x0084 }
            java.util.LinkedHashSet r8 = new java.util.LinkedHashSet     // Catch:{ all -> 0x0084 }
            r8.<init>()     // Catch:{ all -> 0x0084 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x0084 }
        L_0x00bb:
            r6 = r5
            i37 r6 = (defpackage.i37) r6     // Catch:{ all -> 0x0084 }
            boolean r6 = r6.c     // Catch:{ all -> 0x0084 }
            if (r6 == 0) goto L_0x00d5
            r6 = r5
            i37 r6 = (defpackage.i37) r6     // Catch:{ all -> 0x0084 }
            int r6 = r6.a()     // Catch:{ all -> 0x0084 }
            int r6 = r0.l(r6)     // Catch:{ all -> 0x0084 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0084 }
            r8.add(r6)     // Catch:{ all -> 0x0084 }
            goto L_0x00bb
        L_0x00d5:
            if (r8 != 0) goto L_0x00d9
            wz4 r8 = defpackage.wz4.a     // Catch:{ all -> 0x0084 }
        L_0x00d9:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0084 }
            r0.<init>()     // Catch:{ all -> 0x0084 }
            java.util.Iterator r5 = r8.iterator()     // Catch:{ all -> 0x0084 }
        L_0x00e2:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x0084 }
            if (r6 == 0) goto L_0x0112
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x0084 }
            java.lang.Number r6 = (java.lang.Number) r6     // Catch:{ all -> 0x0084 }
            int r6 = r6.intValue()     // Catch:{ all -> 0x0084 }
            androidx.recyclerview.widget.b r8 = r13.getRecycledViewPool()     // Catch:{ all -> 0x0084 }
            dec r8 = r8.getRecycledView(r6)     // Catch:{ all -> 0x0084 }
            m8 r10 = new m8     // Catch:{ all -> 0x0084 }
            r10.<init>(r6, r2, r13)     // Catch:{ all -> 0x0084 }
            if (r8 != 0) goto L_0x0103
            r6 = r4
            goto L_0x010e
        L_0x0103:
            km4 r6 = new km4     // Catch:{ all -> 0x0084 }
            ie r11 = new ie     // Catch:{ all -> 0x0084 }
            r12 = 6
            r11.<init>((int) r12, (java.lang.Object) r8)     // Catch:{ all -> 0x0084 }
            r6.<init>(r11, r3, r10)     // Catch:{ all -> 0x0084 }
        L_0x010e:
            defpackage.d63.W(r0, r6)     // Catch:{ all -> 0x0084 }
            goto L_0x00e2
        L_0x0112:
            java.util.List[] r13 = new java.util.List[r1]     // Catch:{ all -> 0x0084 }
            r13[r2] = r7     // Catch:{ all -> 0x0084 }
            r13[r3] = r9     // Catch:{ all -> 0x0084 }
            c6d r13 = defpackage.ys.Q(r13)     // Catch:{ all -> 0x0084 }
            n71 r5 = defpackage.n71.t0     // Catch:{ all -> 0x0084 }
            um5 r13 = defpackage.l6d.d0(r13, r5)     // Catch:{ all -> 0x0084 }
            at r5 = new at     // Catch:{ all -> 0x0084 }
            r5.<init>(r1, r0)     // Catch:{ all -> 0x0084 }
            c6d[] r0 = new defpackage.c6d[r1]     // Catch:{ all -> 0x0084 }
            r0[r2] = r13     // Catch:{ all -> 0x0084 }
            r0[r3] = r5     // Catch:{ all -> 0x0084 }
            c6d r13 = defpackage.ys.Q(r0)     // Catch:{ all -> 0x0084 }
            n71 r0 = defpackage.n71.s0     // Catch:{ all -> 0x0084 }
            um5 r13 = defpackage.l6d.d0(r13, r0)     // Catch:{ all -> 0x0084 }
            k8 r0 = new k8     // Catch:{ all -> 0x0084 }
            r0.<init>(r3)     // Catch:{ all -> 0x0084 }
            r1f r1 = new r1f     // Catch:{ all -> 0x0084 }
            r1.<init>(r13, r0)     // Catch:{ all -> 0x0084 }
            goto L_0x0147
        L_0x0142:
            njc r1 = new njc
            r1.<init>(r13)
        L_0x0147:
            boolean r13 = r1 instanceof defpackage.njc
            if (r13 == 0) goto L_0x014c
            goto L_0x014d
        L_0x014c:
            r4 = r1
        L_0x014d:
            c6d r4 = (defpackage.c6d) r4
            k8 r13 = new k8
            r13.<init>(r2)
            l8 r0 = new l8
            r0.<init>(r2, r14)
            um5 r13 = defpackage.v3c.F(r4, r13, r0)
            l8 r0 = new l8
            r0.<init>(r3, r14)
            r1f r13 = defpackage.l6d.f0(r13, r0)
            defpackage.l6d.X(r13)
            goto L_0x0179
        L_0x016a:
            boolean r0 = r13 instanceof android.widget.TextView
            if (r0 == 0) goto L_0x0179
            android.widget.TextView r13 = (android.widget.TextView) r13
            java.lang.CharSequence r13 = r13.getText()
            if (r13 == 0) goto L_0x0179
            defpackage.xfg.c(r13, r14)
        L_0x0179:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m6d.d(android.view.View, fka):void");
    }

    public static float[] e(int i, float[] fArr) {
        if (i >= 0) {
            int length = fArr.length;
            if (length >= 0) {
                int min = Math.min(i, length);
                float[] fArr2 = new float[i];
                System.arraycopy(fArr, 0, fArr2, 0, min);
                return fArr2;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
        throw new IllegalArgumentException();
    }

    public static final void f(Drawable drawable, Drawable drawable2) {
        if (drawable2 != null && drawable != null && drawable != drawable2) {
            drawable.setBounds(drawable2.getBounds());
            drawable.setChangingConfigurations(drawable2.getChangingConfigurations());
            drawable.setLevel(drawable2.getLevel());
            drawable.setVisible(drawable2.isVisible(), false);
            drawable.setState(drawable2.getState());
        }
    }

    public static byte[] g(bj4[] bj4Arr, byte[] bArr) {
        int i = 0;
        for (bj4 bj4 : bj4Arr) {
            i += ((((bj4.g * 2) + 7) & -8) / 8) + (bj4.e * 2) + p(bj4.a, bj4.b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + bj4.f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i);
        if (Arrays.equals(bArr, oag.d)) {
            for (bj4 bj42 : bj4Arr) {
                U(byteArrayOutputStream, bj42, p(bj42.a, bj42.b, bArr));
                W(byteArrayOutputStream, bj42);
                int[] iArr = bj42.h;
                int length = iArr.length;
                int i2 = 0;
                int i3 = 0;
                while (i2 < length) {
                    int i4 = iArr[i2];
                    i24.K(i4 - i3, byteArrayOutputStream);
                    i2++;
                    i3 = i4;
                }
                V(byteArrayOutputStream, bj42);
            }
        } else {
            for (bj4 bj43 : bj4Arr) {
                U(byteArrayOutputStream, bj43, p(bj43.a, bj43.b, bArr));
            }
            for (bj4 bj44 : bj4Arr) {
                W(byteArrayOutputStream, bj44);
                int[] iArr2 = bj44.h;
                int length2 = iArr2.length;
                int i5 = 0;
                int i6 = 0;
                while (i5 < length2) {
                    int i7 = iArr2[i5];
                    i24.K(i7 - i6, byteArrayOutputStream);
                    i5++;
                    i6 = i7;
                }
                V(byteArrayOutputStream, bj44);
            }
        }
        if (byteArrayOutputStream.size() == i) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0083, code lost:
        r13 = 0;
        r15 = 1;
        r16 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008d, code lost:
        r13 = 0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0096 A[Catch:{ NumberFormatException -> 0x00aa }, LOOP:3: B:22:0x0068->B:41:0x0096, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00d7 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0095 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.sra[] h(java.lang.String r17) {
        /*
            r0 = r17
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
            r5 = r2
            r4 = 1
        L_0x000a:
            int r6 = r17.length()
            if (r4 >= r6) goto L_0x00de
        L_0x0010:
            int r6 = r17.length()
            r7 = 69
            r8 = 101(0x65, float:1.42E-43)
            if (r4 >= r6) goto L_0x0034
            char r6 = r0.charAt(r4)
            int r9 = r6 + -65
            int r10 = r6 + -90
            int r10 = r10 * r9
            if (r10 <= 0) goto L_0x002c
            int r9 = r6 + -97
            int r10 = r6 + -122
            int r10 = r10 * r9
            if (r10 > 0) goto L_0x0031
        L_0x002c:
            if (r6 == r8) goto L_0x0031
            if (r6 == r7) goto L_0x0031
            goto L_0x0034
        L_0x0031:
            int r4 = r4 + 1
            goto L_0x0010
        L_0x0034:
            java.lang.String r5 = r0.substring(r5, r4)
            java.lang.String r5 = r5.trim()
            boolean r6 = r5.isEmpty()
            if (r6 != 0) goto L_0x00d7
            char r6 = r5.charAt(r2)
            r9 = 122(0x7a, float:1.71E-43)
            if (r6 == r9) goto L_0x00c9
            char r6 = r5.charAt(r2)
            r9 = 90
            if (r6 != r9) goto L_0x0054
            goto L_0x00c9
        L_0x0054:
            int r6 = r5.length()     // Catch:{ NumberFormatException -> 0x00aa }
            float[] r6 = new float[r6]     // Catch:{ NumberFormatException -> 0x00aa }
            int r9 = r5.length()     // Catch:{ NumberFormatException -> 0x00aa }
            r11 = r2
            r10 = 1
        L_0x0060:
            if (r10 >= r9) goto L_0x00b4
            r13 = r2
            r14 = r13
            r15 = r14
            r16 = r15
            r12 = r10
        L_0x0068:
            int r3 = r5.length()     // Catch:{ NumberFormatException -> 0x00aa }
            if (r12 >= r3) goto L_0x009a
            char r3 = r5.charAt(r12)     // Catch:{ NumberFormatException -> 0x00aa }
            r2 = 32
            if (r3 == r2) goto L_0x0091
            if (r3 == r7) goto L_0x008f
            if (r3 == r8) goto L_0x008f
            switch(r3) {
                case 44: goto L_0x0091;
                case 45: goto L_0x0088;
                case 46: goto L_0x007e;
                default: goto L_0x007d;
            }     // Catch:{ NumberFormatException -> 0x00aa }
        L_0x007d:
            goto L_0x008d
        L_0x007e:
            if (r14 != 0) goto L_0x0083
            r13 = 0
            r14 = 1
            goto L_0x0093
        L_0x0083:
            r13 = 0
            r15 = 1
            r16 = 1
            goto L_0x0093
        L_0x0088:
            if (r12 == r10) goto L_0x008d
            if (r13 != 0) goto L_0x008d
            goto L_0x0083
        L_0x008d:
            r13 = 0
            goto L_0x0093
        L_0x008f:
            r13 = 1
            goto L_0x0093
        L_0x0091:
            r13 = 0
            r15 = 1
        L_0x0093:
            if (r15 == 0) goto L_0x0096
            goto L_0x009a
        L_0x0096:
            int r12 = r12 + 1
            r2 = 0
            goto L_0x0068
        L_0x009a:
            if (r10 >= r12) goto L_0x00ac
            int r2 = r11 + 1
            java.lang.String r3 = r5.substring(r10, r12)     // Catch:{ NumberFormatException -> 0x00aa }
            float r3 = java.lang.Float.parseFloat(r3)     // Catch:{ NumberFormatException -> 0x00aa }
            r6[r11] = r3     // Catch:{ NumberFormatException -> 0x00aa }
            r11 = r2
            goto L_0x00ac
        L_0x00aa:
            r0 = move-exception
            goto L_0x00bb
        L_0x00ac:
            if (r16 == 0) goto L_0x00b1
            r10 = r12
        L_0x00af:
            r2 = 0
            goto L_0x0060
        L_0x00b1:
            int r10 = r12 + 1
            goto L_0x00af
        L_0x00b4:
            float[] r2 = e(r11, r6)     // Catch:{ NumberFormatException -> 0x00aa }
            r3 = r2
            r2 = 0
            goto L_0x00cb
        L_0x00bb:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "error in parsing \""
            java.lang.String r3 = "\""
            java.lang.String r2 = defpackage.zr6.i(r2, r5, r3)
            r1.<init>(r2, r0)
            throw r1
        L_0x00c9:
            float[] r3 = new float[r2]
        L_0x00cb:
            char r5 = r5.charAt(r2)
            sra r2 = new sra
            r2.<init>(r5, r3)
            r1.add(r2)
        L_0x00d7:
            int r2 = r4 + 1
            r5 = r4
            r4 = r2
            r2 = 0
            goto L_0x000a
        L_0x00de:
            int r4 = r4 - r5
            r2 = 1
            if (r4 != r2) goto L_0x00f8
            int r2 = r17.length()
            if (r5 >= r2) goto L_0x00f8
            char r0 = r0.charAt(r5)
            r2 = 0
            float[] r3 = new float[r2]
            sra r4 = new sra
            r4.<init>(r0, r3)
            r1.add(r4)
            goto L_0x00f9
        L_0x00f8:
            r2 = 0
        L_0x00f9:
            sra[] r0 = new defpackage.sra[r2]
            java.lang.Object[] r0 = r1.toArray(r0)
            sra[] r0 = (defpackage.sra[]) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m6d.h(java.lang.String):sra[]");
    }

    public static Path i(String str) {
        Path path = new Path();
        try {
            A(h(str), path);
            return path;
        } catch (RuntimeException e) {
            throw new RuntimeException("Error in parsing ".concat(str), e);
        }
    }

    public static sra[] j(sra[] sraArr) {
        sra[] sraArr2 = new sra[sraArr.length];
        for (int i = 0; i < sraArr.length; i++) {
            sraArr2[i] = new sra(sraArr[i]);
        }
        return sraArr2;
    }

    public static final void k(File file) {
        if (file.exists() && !lk5.F(file)) {
            throw new IOException("Can't delete " + file);
        }
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean l() {
        /*
            java.lang.String r0 = "delivery_metrics_exported_to_big_query_enabled"
            r1 = 0
            defpackage.fl5.b()     // Catch:{ IllegalStateException -> 0x0045 }
            fl5 r2 = defpackage.fl5.b()
            r2.a()
            java.lang.String r3 = "com.google.firebase.messaging"
            android.content.Context r2 = r2.a
            android.content.SharedPreferences r3 = r2.getSharedPreferences(r3, r1)
            java.lang.String r4 = "export_to_big_query"
            boolean r5 = r3.contains(r4)
            if (r5 == 0) goto L_0x0022
            boolean r0 = r3.getBoolean(r4, r1)
            return r0
        L_0x0022:
            android.content.pm.PackageManager r3 = r2.getPackageManager()     // Catch:{  }
            if (r3 == 0) goto L_0x0045
            java.lang.String r2 = r2.getPackageName()     // Catch:{  }
            r4 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r2 = r3.getApplicationInfo(r2, r4)     // Catch:{  }
            if (r2 == 0) goto L_0x0045
            android.os.Bundle r3 = r2.metaData     // Catch:{  }
            if (r3 == 0) goto L_0x0045
            boolean r3 = r3.containsKey(r0)     // Catch:{  }
            if (r3 == 0) goto L_0x0045
            android.os.Bundle r2 = r2.metaData     // Catch:{  }
            boolean r0 = r2.getBoolean(r0, r1)     // Catch:{  }
            return r0
        L_0x0045:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m6d.l():boolean");
    }

    public static long m(long j, long j2, RoundingMode roundingMode) {
        roundingMode.getClass();
        long j3 = j / j2;
        long j4 = j - (j2 * j3);
        int i = (j4 > 0 ? 1 : (j4 == 0 ? 0 : -1));
        if (i == 0) {
            return j3;
        }
        int i2 = ((int) ((j ^ j2) >> 63)) | 1;
        switch (pv7.a[roundingMode.ordinal()]) {
            case 1:
                if (i == 0) {
                    return j3;
                }
                throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
            case 2:
                return j3;
            case 3:
                if (i2 >= 0) {
                    return j3;
                }
                break;
            case 4:
                break;
            case 5:
                if (i2 <= 0) {
                    return j3;
                }
                break;
            case 6:
            case 7:
            case 8:
                long abs = Math.abs(j4);
                int i3 = ((abs - (Math.abs(j2) - abs)) > 0 ? 1 : ((abs - (Math.abs(j2) - abs)) == 0 ? 0 : -1));
                if (i3 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP && (roundingMode != RoundingMode.HALF_EVEN || (1 & j3) == 0)) {
                        return j3;
                    }
                } else if (i3 <= 0) {
                    return j3;
                }
                break;
            default:
                throw new AssertionError();
        }
        return j3 + ((long) i2);
    }

    public static Map n(qqd qqd) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator G = qqd.G();
        while (G.hasNext()) {
            Object y = qqd.y(G.next());
            Object obj = linkedHashMap.get(y);
            if (obj == null && !linkedHashMap.containsKey(y)) {
                obj = new Object();
            }
            kec kec = (kec) obj;
            kec.a++;
            linkedHashMap.put(y, kec);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (!(entry instanceof qb7) || (entry instanceof tb7)) {
                entry.setValue(Integer.valueOf(((kec) entry.getValue()).a));
            } else {
                f8.A(entry, "kotlin.collections.MutableMap.MutableEntry");
                throw null;
            }
        }
        f8.b(linkedHashMap);
        return linkedHashMap;
    }

    public static long o(long j, long j2) {
        od2.n(j, "a");
        od2.n(j2, "b");
        if (j == 0) {
            return j2;
        }
        if (j2 == 0) {
            return j;
        }
        int numberOfTrailingZeros = Long.numberOfTrailingZeros(j);
        long j3 = j >> numberOfTrailingZeros;
        int numberOfTrailingZeros2 = Long.numberOfTrailingZeros(j2);
        long j4 = j2 >> numberOfTrailingZeros2;
        while (j3 != j4) {
            long j5 = j3 - j4;
            long j6 = (j5 >> 63) & j5;
            long j7 = (j5 - j6) - j6;
            j4 += j6;
            j3 = j7 >> Long.numberOfTrailingZeros(j7);
        }
        return j3 << Math.min(numberOfTrailingZeros, numberOfTrailingZeros2);
    }

    public static String p(String str, String str2, byte[] bArr) {
        byte[] bArr2 = oag.f;
        boolean equals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = oag.e;
        String str3 = "!";
        String str4 = (!equals && !Arrays.equals(bArr, bArr3)) ? str3 : ":";
        if (str.length() <= 0) {
            return str3.equals(str4) ? str2.replace(":", str3) : ":".equals(str4) ? str2.replace(str3, ":") : str2;
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (str2.contains(str3) || str2.contains(":")) {
            return str3.equals(str4) ? str2.replace(":", str3) : ":".equals(str4) ? str2.replace(str3, ":") : str2;
        }
        if (str2.endsWith(".apk")) {
            return str2;
        }
        StringBuilder l = au1.l(str);
        if (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) {
            str3 = ":";
        }
        return zr6.l(l, str3, str2);
    }

    public static HashMap q() {
        HashMap hashMap = new HashMap(286);
        ArrayList arrayList = new ArrayList(25);
        arrayList.add("US");
        arrayList.add("AG");
        arrayList.add("AI");
        arrayList.add("AS");
        arrayList.add("BB");
        arrayList.add("BM");
        arrayList.add("BS");
        arrayList.add("CA");
        arrayList.add("DM");
        arrayList.add("DO");
        arrayList.add("GD");
        arrayList.add("GU");
        arrayList.add("JM");
        arrayList.add("KN");
        arrayList.add("KY");
        arrayList.add("LC");
        arrayList.add("MP");
        arrayList.add("MS");
        arrayList.add("PR");
        arrayList.add("SX");
        arrayList.add("TC");
        arrayList.add("TT");
        arrayList.add("VC");
        arrayList.add("VG");
        arrayList.add("VI");
        hashMap.put(1, arrayList);
        ArrayList arrayList2 = new ArrayList(2);
        arrayList2.add("RU");
        arrayList2.add("KZ");
        ArrayList f = ms2.f(36, hashMap, ms2.f(34, hashMap, ms2.f(33, hashMap, ms2.f(32, hashMap, ms2.f(31, hashMap, ms2.f(30, hashMap, ms2.f(27, hashMap, ms2.f(20, hashMap, ms2.f(7, hashMap, arrayList2, 1, "EG"), 1, "ZA"), 1, "GR"), 1, "NL"), 1, "BE"), 1, "FR"), 1, "ES"), 1, "HU"), 2, "IT");
        f.add("VA");
        hashMap.put(39, f);
        ArrayList arrayList3 = new ArrayList(1);
        arrayList3.add("RO");
        ArrayList f2 = ms2.f(43, hashMap, ms2.f(41, hashMap, ms2.f(40, hashMap, arrayList3, 1, "CH"), 1, "AT"), 4, "GB");
        f2.add("GG");
        f2.add("IM");
        f2.add("JE");
        hashMap.put(44, f2);
        ArrayList arrayList4 = new ArrayList(1);
        arrayList4.add("DK");
        ArrayList f3 = ms2.f(46, hashMap, ms2.f(45, hashMap, arrayList4, 1, "SE"), 2, "NO");
        f3.add("SJ");
        hashMap.put(47, f3);
        ArrayList arrayList5 = new ArrayList(1);
        arrayList5.add("PL");
        ArrayList f4 = ms2.f(60, hashMap, ms2.f(58, hashMap, ms2.f(57, hashMap, ms2.f(56, hashMap, ms2.f(55, hashMap, ms2.f(54, hashMap, ms2.f(53, hashMap, ms2.f(52, hashMap, ms2.f(51, hashMap, ms2.f(49, hashMap, ms2.f(48, hashMap, arrayList5, 1, "DE"), 1, "PE"), 1, "MX"), 1, "CU"), 1, "AR"), 1, "BR"), 1, "CL"), 1, "CO"), 1, "VE"), 1, "MY"), 3, "AU");
        f4.add("CC");
        f4.add("CX");
        hashMap.put(61, f4);
        ArrayList arrayList6 = new ArrayList(1);
        arrayList6.add("ID");
        ArrayList f5 = ms2.f(211, hashMap, ms2.f(98, hashMap, ms2.f(95, hashMap, ms2.f(94, hashMap, ms2.f(93, hashMap, ms2.f(92, hashMap, ms2.f(91, hashMap, ms2.f(90, hashMap, ms2.f(86, hashMap, ms2.f(84, hashMap, ms2.f(82, hashMap, ms2.f(81, hashMap, ms2.f(66, hashMap, ms2.f(65, hashMap, ms2.f(64, hashMap, ms2.f(63, hashMap, ms2.f(62, hashMap, arrayList6, 1, "PH"), 1, "NZ"), 1, "SG"), 1, "TH"), 1, "JP"), 1, "KR"), 1, "VN"), 1, "CN"), 1, "TR"), 1, "IN"), 1, "PK"), 1, "AF"), 1, "LK"), 1, "MM"), 1, "IR"), 1, "SS"), 2, "MA");
        f5.add("EH");
        hashMap.put(212, f5);
        ArrayList arrayList7 = new ArrayList(1);
        arrayList7.add("DZ");
        ArrayList f6 = ms2.f(261, hashMap, ms2.f(260, hashMap, ms2.f(258, hashMap, ms2.f(257, hashMap, ms2.f(256, hashMap, ms2.f(255, hashMap, ms2.f(254, hashMap, ms2.f(253, hashMap, ms2.f(252, hashMap, ms2.f(251, hashMap, ms2.f(250, hashMap, ms2.f(249, hashMap, ms2.f(248, hashMap, ms2.f(247, hashMap, ms2.f(246, hashMap, ms2.f(245, hashMap, ms2.f(244, hashMap, ms2.f(243, hashMap, ms2.f(242, hashMap, ms2.f(241, hashMap, ms2.f(240, hashMap, ms2.f(239, hashMap, ms2.f(238, hashMap, ms2.f(237, hashMap, ms2.f(236, hashMap, ms2.f(235, hashMap, ms2.f(234, hashMap, ms2.f(233, hashMap, ms2.f(232, hashMap, ms2.f(231, hashMap, ms2.f(230, hashMap, ms2.f(229, hashMap, ms2.f(228, hashMap, ms2.f(227, hashMap, ms2.f(226, hashMap, ms2.f(225, hashMap, ms2.f(224, hashMap, ms2.f(223, hashMap, ms2.f(222, hashMap, ms2.f(221, hashMap, ms2.f(220, hashMap, ms2.f(218, hashMap, ms2.f(216, hashMap, ms2.f(213, hashMap, arrayList7, 1, "TN"), 1, "LY"), 1, "GM"), 1, "SN"), 1, "MR"), 1, "ML"), 1, "GN"), 1, "CI"), 1, "BF"), 1, "NE"), 1, "TG"), 1, "BJ"), 1, "MU"), 1, "LR"), 1, "SL"), 1, "GH"), 1, "NG"), 1, "TD"), 1, "CF"), 1, "CM"), 1, "CV"), 1, "ST"), 1, "GQ"), 1, "GA"), 1, "CG"), 1, "CD"), 1, "AO"), 1, "GW"), 1, "IO"), 1, "AC"), 1, "SC"), 1, "SD"), 1, "RW"), 1, "ET"), 1, "SO"), 1, "DJ"), 1, "KE"), 1, "TZ"), 1, "UG"), 1, "BI"), 1, "MZ"), 1, "ZM"), 1, "MG"), 2, "RE");
        f6.add("YT");
        hashMap.put(262, f6);
        ArrayList arrayList8 = new ArrayList(1);
        arrayList8.add("ZW");
        ArrayList f7 = ms2.f(269, hashMap, ms2.f(268, hashMap, ms2.f(267, hashMap, ms2.f(266, hashMap, ms2.f(265, hashMap, ms2.f(264, hashMap, ms2.f(263, hashMap, arrayList8, 1, "NA"), 1, "MW"), 1, "LS"), 1, "BW"), 1, "SZ"), 1, "KM"), 2, "SH");
        f7.add("TA");
        hashMap.put(290, f7);
        ArrayList arrayList9 = new ArrayList(1);
        arrayList9.add("ER");
        ArrayList f8 = ms2.f(357, hashMap, ms2.f(356, hashMap, ms2.f(355, hashMap, ms2.f(354, hashMap, ms2.f(353, hashMap, ms2.f(352, hashMap, ms2.f(351, hashMap, ms2.f(350, hashMap, ms2.f(299, hashMap, ms2.f(298, hashMap, ms2.f(297, hashMap, ms2.f(291, hashMap, arrayList9, 1, "AW"), 1, "FO"), 1, "GL"), 1, "GI"), 1, "PT"), 1, "LU"), 1, "IE"), 1, "IS"), 1, "AL"), 1, "MT"), 1, "CY"), 2, "FI");
        f8.add("AX");
        hashMap.put(358, f8);
        ArrayList arrayList10 = new ArrayList(1);
        arrayList10.add("BG");
        ArrayList f9 = ms2.f(509, hashMap, ms2.f(508, hashMap, ms2.f(HttpStatus.SC_INSUFFICIENT_STORAGE, hashMap, ms2.f(506, hashMap, ms2.f(HttpStatus.SC_HTTP_VERSION_NOT_SUPPORTED, hashMap, ms2.f(HttpStatus.SC_GATEWAY_TIMEOUT, hashMap, ms2.f(HttpStatus.SC_SERVICE_UNAVAILABLE, hashMap, ms2.f(HttpStatus.SC_BAD_GATEWAY, hashMap, ms2.f(HttpStatus.SC_NOT_IMPLEMENTED, hashMap, ms2.f(500, hashMap, ms2.f(HttpStatus.SC_LOCKED, hashMap, ms2.f(421, hashMap, ms2.f(HttpStatus.SC_METHOD_FAILURE, hashMap, ms2.f(389, hashMap, ms2.f(387, hashMap, ms2.f(386, hashMap, ms2.f(385, hashMap, ms2.f(383, hashMap, ms2.f(382, hashMap, ms2.f(381, hashMap, ms2.f(380, hashMap, ms2.f(378, hashMap, ms2.f(377, hashMap, ms2.f(376, hashMap, ms2.f(375, hashMap, ms2.f(374, hashMap, ms2.f(373, hashMap, ms2.f(372, hashMap, ms2.f(371, hashMap, ms2.f(370, hashMap, ms2.f(359, hashMap, arrayList10, 1, "LT"), 1, "LV"), 1, "EE"), 1, "MD"), 1, "AM"), 1, "BY"), 1, "AD"), 1, "MC"), 1, "SM"), 1, "UA"), 1, "RS"), 1, "ME"), 1, "XK"), 1, "HR"), 1, "SI"), 1, "BA"), 1, "MK"), 1, "CZ"), 1, "SK"), 1, "LI"), 1, "FK"), 1, "BZ"), 1, "GT"), 1, "SV"), 1, "HN"), 1, "NI"), 1, "CR"), 1, "PA"), 1, "PM"), 1, "HT"), 3, "GP");
        f9.add("BL");
        f9.add("MF");
        hashMap.put(590, f9);
        ArrayList arrayList11 = new ArrayList(1);
        arrayList11.add("BO");
        ArrayList f10 = ms2.f(598, hashMap, ms2.f(597, hashMap, ms2.f(596, hashMap, ms2.f(595, hashMap, ms2.f(594, hashMap, ms2.f(593, hashMap, ms2.f(592, hashMap, ms2.f(591, hashMap, arrayList11, 1, "GY"), 1, "EC"), 1, "GF"), 1, "PY"), 1, "MQ"), 1, "SR"), 1, "UY"), 2, "CW");
        f10.add("BQ");
        hashMap.put(599, f10);
        ArrayList arrayList12 = new ArrayList(1);
        arrayList12.add("TL");
        hashMap.put(998, ms2.f(996, hashMap, ms2.f(995, hashMap, ms2.f(994, hashMap, ms2.f(993, hashMap, ms2.f(992, hashMap, ms2.f(979, hashMap, ms2.f(977, hashMap, ms2.f(976, hashMap, ms2.f(975, hashMap, ms2.f(974, hashMap, ms2.f(973, hashMap, ms2.f(972, hashMap, ms2.f(971, hashMap, ms2.f(970, hashMap, ms2.f(968, hashMap, ms2.f(967, hashMap, ms2.f(966, hashMap, ms2.f(965, hashMap, ms2.f(964, hashMap, ms2.f(963, hashMap, ms2.f(962, hashMap, ms2.f(961, hashMap, ms2.f(960, hashMap, ms2.f(888, hashMap, ms2.f(886, hashMap, ms2.f(883, hashMap, ms2.f(882, hashMap, ms2.f(881, hashMap, ms2.f(880, hashMap, ms2.f(878, hashMap, ms2.f(870, hashMap, ms2.f(856, hashMap, ms2.f(855, hashMap, ms2.f(853, hashMap, ms2.f(852, hashMap, ms2.f(850, hashMap, ms2.f(808, hashMap, ms2.f(800, hashMap, ms2.f(692, hashMap, ms2.f(691, hashMap, ms2.f(690, hashMap, ms2.f(689, hashMap, ms2.f(688, hashMap, ms2.f(687, hashMap, ms2.f(686, hashMap, ms2.f(685, hashMap, ms2.f(683, hashMap, ms2.f(682, hashMap, ms2.f(681, hashMap, ms2.f(680, hashMap, ms2.f(679, hashMap, ms2.f(678, hashMap, ms2.f(677, hashMap, ms2.f(676, hashMap, ms2.f(675, hashMap, ms2.f(674, hashMap, ms2.f(673, hashMap, ms2.f(672, hashMap, ms2.f(670, hashMap, arrayList12, 1, "NF"), 1, "BN"), 1, "NR"), 1, "PG"), 1, "TO"), 1, "SB"), 1, "VU"), 1, "FJ"), 1, "PW"), 1, "WF"), 1, "CK"), 1, "NU"), 1, "WS"), 1, "KI"), 1, "NC"), 1, "TV"), 1, "PF"), 1, "TK"), 1, "FM"), 1, "MH"), 1, "001"), 1, "001"), 1, "KP"), 1, "HK"), 1, "MO"), 1, "KH"), 1, "LA"), 1, "001"), 1, "001"), 1, "BD"), 1, "001"), 1, "001"), 1, "001"), 1, "TW"), 1, "001"), 1, "MV"), 1, "LB"), 1, "JO"), 1, "SY"), 1, "IQ"), 1, "KW"), 1, "SA"), 1, "YE"), 1, "OM"), 1, "PS"), 1, "AE"), 1, "IL"), 1, "BH"), 1, "QA"), 1, "BT"), 1, "MN"), 1, "NP"), 1, "001"), 1, "TJ"), 1, "TM"), 1, "AZ"), 1, "GE"), 1, "KG"), 1, "UZ"));
        return hashMap;
    }

    public static int r(int i) {
        int i2 = 0;
        while (i > 0) {
            i2++;
            i >>>= 1;
        }
        return i2;
    }

    public static final int s(int i) {
        if (i == 0) {
            return 0;
        }
        return Color.parseColor(String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(i & 16777215)}, 1)));
    }

    public static final boolean t(es8 es8) {
        cu8 cu8 = es8.a;
        l10 d = cu8.d();
        boolean z = d == null || d.b();
        if (d == null) {
            return true;
        }
        if (z) {
            List list = d.f;
            if (list.size() == 1) {
                long j = cu8.Y;
                Long l = (Long) list.get(0);
                if (l != null && j == l.longValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [kotlin.coroutines.Continuation, f6d, java.lang.Object] */
    public static f6d u(a66 a66) {
        ? obj = new Object();
        obj.o = v3c.j(a66, obj, obj);
        return obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: z89} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: z89} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v28, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: z89} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: z89} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: z89} */
    /* JADX WARNING: type inference failed for: r5v1, types: [l84, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x014f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void v(android.content.Intent r17) {
        /*
            r0 = r17
            boolean r1 = N(r17)
            if (r1 == 0) goto L_0x0011
            java.lang.String r1 = "_nr"
            android.os.Bundle r2 = r17.getExtras()
            w(r1, r2)
        L_0x0011:
            r1 = 0
            if (r0 == 0) goto L_0x0026
            java.lang.String r2 = "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT"
            java.lang.String r3 = r17.getAction()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0021
            goto L_0x0026
        L_0x0021:
            boolean r2 = l()
            goto L_0x0027
        L_0x0026:
            r2 = r1
        L_0x0027:
            if (r2 == 0) goto L_0x01bb
            gpb r2 = com.google.firebase.messaging.FirebaseMessaging.l
            java.lang.Object r2 = r2.get()
            l2f r2 = (defpackage.l2f) r2
            if (r2 != 0) goto L_0x0035
            goto L_0x01bb
        L_0x0035:
            r3 = 0
            if (r0 != 0) goto L_0x003a
            goto L_0x0156
        L_0x003a:
            android.os.Bundle r4 = r17.getExtras()
            if (r4 != 0) goto L_0x0042
            android.os.Bundle r4 = android.os.Bundle.EMPTY
        L_0x0042:
            java.lang.String r5 = "google.ttl"
            java.lang.Object r5 = r4.get(r5)
            boolean r6 = r5 instanceof java.lang.Integer
            if (r6 == 0) goto L_0x0054
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r1 = r5.intValue()
        L_0x0052:
            r13 = r1
            goto L_0x0064
        L_0x0054:
            boolean r6 = r5 instanceof java.lang.String
            if (r6 == 0) goto L_0x0052
            r6 = r5
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ NumberFormatException -> 0x0060 }
            int r1 = java.lang.Integer.parseInt(r6)     // Catch:{ NumberFormatException -> 0x0060 }
            goto L_0x0052
        L_0x0060:
            java.util.Objects.toString(r5)
            goto L_0x0052
        L_0x0064:
            java.lang.String r1 = "google.to"
            java.lang.String r1 = r4.getString(r1)
            boolean r5 = android.text.TextUtils.isEmpty(r1)
            if (r5 != 0) goto L_0x0072
        L_0x0070:
            r9 = r1
            goto L_0x0090
        L_0x0072:
            fl5 r1 = defpackage.fl5.b()     // Catch:{ InterruptedException | ExecutionException -> 0x01b4 }
            java.lang.Object r5 = defpackage.il5.m     // Catch:{ InterruptedException | ExecutionException -> 0x01b4 }
            r1.a()     // Catch:{ InterruptedException | ExecutionException -> 0x01b4 }
            fc3 r1 = r1.d     // Catch:{ InterruptedException | ExecutionException -> 0x01b4 }
            java.lang.Class<jl5> r5 = defpackage.jl5.class
            java.lang.Object r1 = r1.a(r5)     // Catch:{ InterruptedException | ExecutionException -> 0x01b4 }
            il5 r1 = (defpackage.il5) r1     // Catch:{ InterruptedException | ExecutionException -> 0x01b4 }
            ukg r1 = r1.c()     // Catch:{ InterruptedException | ExecutionException -> 0x01b4 }
            java.lang.Object r1 = defpackage.j1e.b(r1)     // Catch:{ InterruptedException | ExecutionException -> 0x01b4 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ InterruptedException | ExecutionException -> 0x01b4 }
            goto L_0x0070
        L_0x0090:
            fl5 r1 = defpackage.fl5.b()
            r1.a()
            android.content.Context r1 = r1.a
            java.lang.String r11 = r1.getPackageName()
            boolean r1 = defpackage.sy4.D(r4)
            if (r1 == 0) goto L_0x00a7
            x89 r1 = defpackage.x89.DISPLAY_NOTIFICATION
        L_0x00a5:
            r10 = r1
            goto L_0x00aa
        L_0x00a7:
            x89 r1 = defpackage.x89.DATA_MESSAGE
            goto L_0x00a5
        L_0x00aa:
            java.lang.String r1 = "google.message_id"
            java.lang.String r1 = r4.getString(r1)
            if (r1 != 0) goto L_0x00b8
            java.lang.String r1 = "message_id"
            java.lang.String r1 = r4.getString(r1)
        L_0x00b8:
            java.lang.String r5 = ""
            if (r1 == 0) goto L_0x00be
            r8 = r1
            goto L_0x00bf
        L_0x00be:
            r8 = r5
        L_0x00bf:
            java.lang.String r1 = "from"
            java.lang.String r1 = r4.getString(r1)
            if (r1 == 0) goto L_0x00d0
            java.lang.String r6 = "/topics/"
            boolean r6 = r1.startsWith(r6)
            if (r6 == 0) goto L_0x00d0
            r3 = r1
        L_0x00d0:
            if (r3 == 0) goto L_0x00d4
            r14 = r3
            goto L_0x00d5
        L_0x00d4:
            r14 = r5
        L_0x00d5:
            java.lang.String r1 = "collapse_key"
            java.lang.String r1 = r4.getString(r1)
            if (r1 == 0) goto L_0x00df
            r12 = r1
            goto L_0x00e0
        L_0x00df:
            r12 = r5
        L_0x00e0:
            java.lang.String r1 = "google.c.a.m_l"
            java.lang.String r1 = r4.getString(r1)
            if (r1 == 0) goto L_0x00ea
            r15 = r1
            goto L_0x00eb
        L_0x00ea:
            r15 = r5
        L_0x00eb:
            java.lang.String r1 = "google.c.a.c_l"
            java.lang.String r1 = r4.getString(r1)
            if (r1 == 0) goto L_0x00f6
            r16 = r1
            goto L_0x00f8
        L_0x00f6:
            r16 = r5
        L_0x00f8:
            java.lang.String r1 = "google.c.sender.id"
            boolean r3 = r4.containsKey(r1)
            r5 = 0
            if (r3 == 0) goto L_0x010b
            java.lang.String r1 = r4.getString(r1)     // Catch:{ NumberFormatException -> 0x010b }
            long r3 = java.lang.Long.parseLong(r1)     // Catch:{ NumberFormatException -> 0x010b }
            goto L_0x0149
        L_0x010b:
            fl5 r1 = defpackage.fl5.b()
            r1.a()
            ol5 r3 = r1.c
            java.lang.String r4 = r3.e
            if (r4 == 0) goto L_0x011d
            long r3 = java.lang.Long.parseLong(r4)     // Catch:{ NumberFormatException -> 0x011d }
            goto L_0x0149
        L_0x011d:
            r1.a()
            java.lang.String r1 = r3.b
            java.lang.String r3 = "1:"
            boolean r3 = r1.startsWith(r3)
            if (r3 != 0) goto L_0x012f
            long r3 = java.lang.Long.parseLong(r1)     // Catch:{ NumberFormatException -> 0x0139 }
            goto L_0x0149
        L_0x012f:
            java.lang.String r3 = ":"
            java.lang.String[] r1 = r1.split(r3)
            int r3 = r1.length
            r4 = 2
            if (r3 >= r4) goto L_0x013b
        L_0x0139:
            r3 = r5
            goto L_0x0149
        L_0x013b:
            r3 = 1
            r1 = r1[r3]
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L_0x0145
            goto L_0x0139
        L_0x0145:
            long r3 = java.lang.Long.parseLong(r1)     // Catch:{ NumberFormatException -> 0x0139 }
        L_0x0149:
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 <= 0) goto L_0x014f
            r6 = r3
            goto L_0x0150
        L_0x014f:
            r6 = r5
        L_0x0150:
            z89 r3 = new z89
            r5 = r3
            r5.<init>(r6, r8, r9, r10, r11, r12, r13, r14, r15, r16)
        L_0x0156:
            if (r3 != 0) goto L_0x0159
            goto L_0x01bb
        L_0x0159:
            java.lang.String r1 = "google.product_id"
            r4 = 111881503(0x6ab2d1f, float:6.438935E-35)
            int r0 = r0.getIntExtra(r1, r4)     // Catch:{ RuntimeException -> 0x01bb }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ RuntimeException -> 0x01bb }
            kb0 r1 = new kb0     // Catch:{ RuntimeException -> 0x01bb }
            r1.<init>(r0)     // Catch:{ RuntimeException -> 0x01bb }
            java.lang.String r0 = "proto"
            i15 r4 = new i15     // Catch:{ RuntimeException -> 0x01bb }
            r4.<init>(r0)     // Catch:{ RuntimeException -> 0x01bb }
            av1 r0 = new av1     // Catch:{ RuntimeException -> 0x01bb }
            r0.<init>()     // Catch:{ RuntimeException -> 0x01bb }
            m2f r2 = (defpackage.m2f) r2     // Catch:{ RuntimeException -> 0x01bb }
            java.util.Set r5 = r2.a     // Catch:{ RuntimeException -> 0x01bb }
            boolean r6 = r5.contains(r4)     // Catch:{ RuntimeException -> 0x01bb }
            if (r6 == 0) goto L_0x01a4
            l84 r5 = new l84     // Catch:{ RuntimeException -> 0x01bb }
            hc0 r6 = r2.b     // Catch:{ RuntimeException -> 0x01bb }
            o2f r2 = r2.c     // Catch:{ RuntimeException -> 0x01bb }
            r5.<init>()     // Catch:{ RuntimeException -> 0x01bb }
            r5.a = r6     // Catch:{ RuntimeException -> 0x01bb }
            java.lang.String r6 = "FCM_CLIENT_EVENT_LOGGING"
            r5.b = r6     // Catch:{ RuntimeException -> 0x01bb }
            r5.c = r4     // Catch:{ RuntimeException -> 0x01bb }
            r5.d = r0     // Catch:{ RuntimeException -> 0x01bb }
            r5.e = r2     // Catch:{ RuntimeException -> 0x01bb }
            a99 r0 = new a99     // Catch:{ RuntimeException -> 0x01bb }
            r0.<init>(r3)     // Catch:{ RuntimeException -> 0x01bb }
            ia0 r2 = new ia0     // Catch:{ RuntimeException -> 0x01bb }
            r2.<init>(r0, r1)     // Catch:{ RuntimeException -> 0x01bb }
            r5.K(r2)     // Catch:{ RuntimeException -> 0x01bb }
            goto L_0x01bb
        L_0x01a4:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ RuntimeException -> 0x01bb }
            java.lang.String r1 = "%s is not supported byt this factory. Supported encodings are: %s."
            java.lang.Object[] r2 = new java.lang.Object[]{r4, r5}     // Catch:{ RuntimeException -> 0x01bb }
            java.lang.String r1 = java.lang.String.format(r1, r2)     // Catch:{ RuntimeException -> 0x01bb }
            r0.<init>(r1)     // Catch:{ RuntimeException -> 0x01bb }
            throw r0     // Catch:{ RuntimeException -> 0x01bb }
        L_0x01b4:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x01bb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m6d.v(android.content.Intent):void");
    }

    public static void w(String str, Bundle bundle) {
        try {
            fl5.b();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String string = bundle.getString("google.c.a.c_id");
            if (string != null) {
                bundle2.putString("_nmid", string);
            }
            String string2 = bundle.getString("google.c.a.c_l");
            if (string2 != null) {
                bundle2.putString("_nmn", string2);
            }
            String string3 = bundle.getString("google.c.a.m_l");
            if (!TextUtils.isEmpty(string3)) {
                bundle2.putString("label", string3);
            }
            String string4 = bundle.getString("google.c.a.m_c");
            if (!TextUtils.isEmpty(string4)) {
                bundle2.putString("message_channel", string4);
            }
            String string5 = bundle.getString("from");
            String str2 = null;
            if (string5 == null || !string5.startsWith("/topics/")) {
                string5 = null;
            }
            if (string5 != null) {
                bundle2.putString("_nt", string5);
            }
            String string6 = bundle.getString("google.c.a.ts");
            if (string6 != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(string6));
                } catch (NumberFormatException unused) {
                }
            }
            if (bundle.containsKey("google.c.a.udt")) {
                str2 = bundle.getString("google.c.a.udt");
            }
            if (str2 != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(str2));
                } catch (NumberFormatException unused2) {
                }
            }
            String str3 = sy4.D(bundle) ? "display" : "data";
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", str3);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                bundle2.toString();
            }
            fl5 b2 = fl5.b();
            b2.a();
            au1.r(b2.d.a(bd.class));
        } catch (IllegalStateException unused3) {
        }
    }

    public static Typeface x(Configuration configuration, Typeface typeface) {
        if (Build.VERSION.SDK_INT < 31 || configuration.fontWeightAdjustment == Integer.MAX_VALUE || configuration.fontWeightAdjustment == 0 || typeface == null) {
            return null;
        }
        return Typeface.create(typeface, z04.p(configuration.fontWeightAdjustment + typeface.getWeight(), 1, 1000), typeface.isItalic());
    }

    public static final void y(File file) {
        if (file.exists()) {
            if (!file.isDirectory()) {
                throw new IOException(file + " is not a directory");
            }
        } else if (!file.mkdirs()) {
            throw new IOException("Can't create " + file);
        }
    }

    public static final int z(int i, int i2) {
        if (i2 == 255) {
            return i;
        }
        if (i2 == 0) {
            return i & 16777215;
        }
        return (i & 16777215) | ((((i >>> 24) * (i2 + (i2 >> 7))) >> 8) << 24);
    }
}
