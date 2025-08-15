package com.facebook.soloader;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public final class a extends e {
    public final boolean X;
    public final File Y;
    public final int Z;
    public ja5[] a;
    public final ZipFile b;
    public final p5f c;
    public final /* synthetic */ of0 o;

    public a(of0 of0, of0 of02, boolean z) {
        this.o = of0;
        this.b = new ZipFile(of0.e);
        this.c = of02;
        this.X = z;
        this.Y = new File(of0.d.getApplicationInfo().nativeLibraryDir);
        this.Z = of0.g;
    }

    public final ja5[] S() {
        ja5[] ja5Arr = this.a;
        if (ja5Arr != null) {
            return ja5Arr;
        }
        ja5[] o2 = o();
        this.a = o2;
        if (this.X || (this.Z & 1) == 0) {
            return o2;
        }
        for (ja5 ja5 : o2) {
            ZipEntry zipEntry = ja5.o;
            zipEntry.getName();
            File file = this.Y;
            File file2 = new File(file, (String) ja5.b);
            try {
                if (file2.getCanonicalPath().startsWith(file.getCanonicalPath())) {
                    if (file2.isFile()) {
                        if (file2.length() != zipEntry.getSize()) {
                            file2.toString();
                        }
                    }
                    return this.a;
                }
                continue;
            } catch (IOException e) {
                e.toString();
            }
        }
        ja5[] ja5Arr2 = new ja5[0];
        this.a = ja5Arr2;
        return ja5Arr2;
    }

    public final void close() {
        this.b.close();
    }

    public final dle[] m() {
        return S();
    }

    public final void n(File file) {
        rh5 rh5;
        ja5[] S = S();
        byte[] bArr = new byte[32768];
        int length = S.length;
        int i = 0;
        while (i < length) {
            ja5 ja5 = S[i];
            InputStream inputStream = this.b.getInputStream(ja5.o);
            try {
                rh5 = new rh5(ja5, 2, inputStream);
                inputStream = null;
                e.a(rh5, bArr, file);
                rh5.close();
                i++;
            } catch (Throwable th) {
                if (inputStream != null) {
                    inputStream.close();
                }
                throw th;
            }
        }
        return;
        throw th;
    }

    public final ja5[] o() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        HashMap hashMap = new HashMap();
        Pattern compile = Pattern.compile(this.o.f);
        String[] supportedAbis = SysUtil$MarshmallowSysdeps.getSupportedAbis();
        Enumeration<? extends ZipEntry> entries = this.b.entries();
        while (entries.hasMoreElements()) {
            ZipEntry zipEntry = (ZipEntry) entries.nextElement();
            Matcher matcher = compile.matcher(zipEntry.getName());
            if (matcher.matches()) {
                String group = matcher.group(1);
                String group2 = matcher.group(2);
                int i = 0;
                while (true) {
                    if (i >= supportedAbis.length) {
                        i = -1;
                        break;
                    }
                    String str = supportedAbis[i];
                    if (str != null && group.equals(str)) {
                        break;
                    }
                    i++;
                }
                if (i >= 0) {
                    linkedHashSet.add(group);
                    ja5 ja5 = (ja5) hashMap.get(group2);
                    if (ja5 == null || i < ja5.X) {
                        hashMap.put(group2, new ja5(group2, zipEntry, i));
                    }
                }
            }
        }
        String[] strArr = (String[]) linkedHashSet.toArray(new String[linkedHashSet.size()]);
        this.c.getClass();
        ja5[] ja5Arr = (ja5[]) hashMap.values().toArray(new ja5[hashMap.size()]);
        Arrays.sort(ja5Arr);
        return ja5Arr;
    }
}
