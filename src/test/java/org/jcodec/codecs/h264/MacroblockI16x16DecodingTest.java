package org.jcodec.codecs.h264;

import org.jcodec.common.ArrayUtil;
import org.jcodec.common.io.NIOUtils;
import org.jcodec.common.model.ColorSpace;
import org.jcodec.common.model.Picture;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

public class MacroblockI16x16DecodingTest {

    @Test
    public void testMBlockCABAC1() throws IOException {
        BufferH264ES es = new BufferH264ES(
                NIOUtils.fetchFromFile(new File("src/test/resources/h264/cabac/i16x16_1/16x16.264")));
        ByteBuffer data = es.nextFrame().getData();
        Picture buf = Picture.create(16, 16, ColorSpace.YUV420);
        Picture out = new H264Decoder().decodeFrame(data, buf.getData());

        ByteBuffer yuv = NIOUtils.fetchFromFile(new File("src/test/resources/h264/cabac/i16x16_1/16x16.yuv"));
        Assert.assertArrayEquals(ArrayUtil.toByteArrayShifted(getAsIntArray(yuv, 256)), out.getPlaneData(0));
        Assert.assertArrayEquals(ArrayUtil.toByteArrayShifted(getAsIntArray(yuv, 64)), out.getPlaneData(1));
        Assert.assertArrayEquals(ArrayUtil.toByteArrayShifted(getAsIntArray(yuv, 64)), out.getPlaneData(2));
    }

    @Test
    public void testMBlockCABAC2() throws IOException {
        BufferH264ES es = new BufferH264ES(
                NIOUtils.fetchFromFile(new File("src/test/resources/h264/cabac/i16x16_2/32x32.264")));
        ByteBuffer data = es.nextFrame().getData();
        Picture buf = Picture.create(32, 32, ColorSpace.YUV420);
        Picture out = new H264Decoder().decodeFrame(data, buf.getData());

        ByteBuffer yuv = NIOUtils.fetchFromFile(new File("src/test/resources/h264/cabac/i16x16_2/32x32.yuv"));
        Assert.assertArrayEquals(ArrayUtil.toByteArrayShifted(getAsIntArray(yuv, 1024)), out.getPlaneData(0));
        Assert.assertArrayEquals(ArrayUtil.toByteArrayShifted(getAsIntArray(yuv, 256)), out.getPlaneData(1));
        Assert.assertArrayEquals(ArrayUtil.toByteArrayShifted(getAsIntArray(yuv, 256)), out.getPlaneData(2));
    }

    @Test
    public void testMBlockCABAC3() throws IOException {
        BufferH264ES es = new BufferH264ES(
                NIOUtils.fetchFromFile(new File("src/test/resources/h264/cabac/i16x16_3/32x32.264")));
        ByteBuffer data = es.nextFrame().getData();
        Picture buf = Picture.create(32, 32, ColorSpace.YUV420);
        Picture out = new H264Decoder().decodeFrame(data, buf.getData());

        ByteBuffer yuv = NIOUtils.fetchFromFile(new File("src/test/resources/h264/cabac/i16x16_3/32x32.yuv"));
        Assert.assertArrayEquals(ArrayUtil.toByteArrayShifted(getAsIntArray(yuv, 1024)), out.getPlaneData(0));
        Assert.assertArrayEquals(ArrayUtil.toByteArrayShifted(getAsIntArray(yuv, 256)), out.getPlaneData(1));
        Assert.assertArrayEquals(ArrayUtil.toByteArrayShifted(getAsIntArray(yuv, 256)), out.getPlaneData(2));
    }

    @Test
    public void testMBlockCABAC4() throws IOException {
        BufferH264ES es = new BufferH264ES(
                NIOUtils.fetchFromFile(new File("src/test/resources/h264/cabac/i16x16_4/32x32.264")));
        ByteBuffer data = es.nextFrame().getData();
        Picture buf = Picture.create(32, 32, ColorSpace.YUV420);
        Picture out = new H264Decoder().decodeFrame(data, buf.getData());

        ByteBuffer yuv = NIOUtils.fetchFromFile(new File("src/test/resources/h264/cabac/i16x16_4/32x32.yuv"));
        Assert.assertArrayEquals(ArrayUtil.toByteArrayShifted(getAsIntArray(yuv, 1024)), out.getPlaneData(0));
        Assert.assertArrayEquals(ArrayUtil.toByteArrayShifted(getAsIntArray(yuv, 256)), out.getPlaneData(1));
        Assert.assertArrayEquals(ArrayUtil.toByteArrayShifted(getAsIntArray(yuv, 256)), out.getPlaneData(2));
    }

    @Test
    public void testMBlockCABAC5() throws IOException {
        BufferH264ES es = new BufferH264ES(
                NIOUtils.fetchFromFile(new File("src/test/resources/h264/cabac/i16x16_5/32x32.264")));
        ByteBuffer data = es.nextFrame().getData();
        Picture buf = Picture.create(32, 32, ColorSpace.YUV420);
        Picture out = new H264Decoder().decodeFrame(data, buf.getData());

        ByteBuffer yuv = NIOUtils.fetchFromFile(new File("src/test/resources/h264/cabac/i16x16_5/32x32.yuv"));
        Assert.assertArrayEquals(ArrayUtil.toByteArrayShifted(getAsIntArray(yuv, 1024)), out.getPlaneData(0));
        Assert.assertArrayEquals(ArrayUtil.toByteArrayShifted(getAsIntArray(yuv, 256)), out.getPlaneData(1));
        Assert.assertArrayEquals(ArrayUtil.toByteArrayShifted(getAsIntArray(yuv, 256)), out.getPlaneData(2));
    }

    @Test
    public void testMBlockCAVLC() throws IOException {
        BufferH264ES es = new BufferH264ES(
                NIOUtils.fetchFromFile(new File("src/test/resources/h264/cavlc/i16x16_420/16x16.264")));
        ByteBuffer data = es.nextFrame().getData();
        Picture buf = Picture.create(16, 16, ColorSpace.YUV420);
        Picture out = new H264Decoder().decodeFrame(data, buf.getData());

        ByteBuffer yuv = NIOUtils.fetchFromFile(new File("src/test/resources/h264/cavlc/i16x16_420/16x16.yuv"));
        Assert.assertArrayEquals(ArrayUtil.toByteArrayShifted(getAsIntArray(yuv, 256)), out.getPlaneData(0));
        Assert.assertArrayEquals(ArrayUtil.toByteArrayShifted(getAsIntArray(yuv, 64)), out.getPlaneData(1));
        Assert.assertArrayEquals(ArrayUtil.toByteArrayShifted(getAsIntArray(yuv, 64)), out.getPlaneData(2));
    }

    @Test
    public void testMBlockCAVLC1() throws IOException {
        BufferH264ES es = new BufferH264ES(
                NIOUtils.fetchFromFile(new File("src/test/resources/h264/cavlc/i16x16_420_1/32x32_1.264")));
        ByteBuffer data = es.nextFrame().getData();
        Picture buf = Picture.create(32, 32, ColorSpace.YUV420);
        Picture out = new H264Decoder().decodeFrame(data, buf.getData());

        ByteBuffer yuv = NIOUtils.fetchFromFile(new File("src/test/resources/h264/cavlc/i16x16_420_1/32x32_1.yuv"));
        Assert.assertArrayEquals(ArrayUtil.toByteArrayShifted(getAsIntArray(yuv, 1024)), out.getPlaneData(0));
        Assert.assertArrayEquals(ArrayUtil.toByteArrayShifted(getAsIntArray(yuv, 256)), out.getPlaneData(1));
        Assert.assertArrayEquals(ArrayUtil.toByteArrayShifted(getAsIntArray(yuv, 256)), out.getPlaneData(2));
    }

    @Test
    public void testMBlockCAVLC2() throws IOException {
        BufferH264ES es = new BufferH264ES(
                NIOUtils.fetchFromFile(new File("src/test/resources/h264/cavlc/i16x16_420_2/32x32_2.264")));
        ByteBuffer data = es.nextFrame().getData();
        Picture buf = Picture.create(32, 32, ColorSpace.YUV420);
        Picture out = new H264Decoder().decodeFrame(data, buf.getData());

        ByteBuffer yuv = NIOUtils.fetchFromFile(new File("src/test/resources/h264/cavlc/i16x16_420_2/32x32_2.yuv"));
        Assert.assertArrayEquals(ArrayUtil.toByteArrayShifted(getAsIntArray(yuv, 1024)), out.getPlaneData(0));
        Assert.assertArrayEquals(ArrayUtil.toByteArrayShifted(getAsIntArray(yuv, 256)), out.getPlaneData(1));
        Assert.assertArrayEquals(ArrayUtil.toByteArrayShifted(getAsIntArray(yuv, 256)), out.getPlaneData(2));
    }

    @Test
    public void testMBlockCAVLC3() throws IOException {
        BufferH264ES es = new BufferH264ES(
                NIOUtils.fetchFromFile(new File("src/test/resources/h264/cavlc/i16x16_420_3/32x32_3.264")));
        ByteBuffer data = es.nextFrame().getData();
        Picture buf = Picture.create(32, 32, ColorSpace.YUV420);
        Picture out = new H264Decoder().decodeFrame(data, buf.getData());

        ByteBuffer yuv = NIOUtils.fetchFromFile(new File("src/test/resources/h264/cavlc/i16x16_420_3/32x32_3.yuv"));
        Assert.assertArrayEquals(ArrayUtil.toByteArrayShifted(getAsIntArray(yuv, 1024)), out.getPlaneData(0));
        Assert.assertArrayEquals(ArrayUtil.toByteArrayShifted(getAsIntArray(yuv, 256)), out.getPlaneData(1));
        Assert.assertArrayEquals(ArrayUtil.toByteArrayShifted(getAsIntArray(yuv, 256)), out.getPlaneData(2));
    }

    @Test
    public void testMBlockCAVLC4() throws IOException {
        BufferH264ES es = new BufferH264ES(
                NIOUtils.fetchFromFile(new File("src/test/resources/h264/cavlc/i16x16_420_4/32x32_4.264")));
        ByteBuffer data = es.nextFrame().getData();
        Picture buf = Picture.create(32, 32, ColorSpace.YUV420);
        Picture out = new H264Decoder().decodeFrame(data, buf.getData());

        ByteBuffer yuv = NIOUtils.fetchFromFile(new File("src/test/resources/h264/cavlc/i16x16_420_4/32x32_4.yuv"));
        Assert.assertArrayEquals(ArrayUtil.toByteArrayShifted(getAsIntArray(yuv, 1024)), out.getPlaneData(0));
        Assert.assertArrayEquals(ArrayUtil.toByteArrayShifted(getAsIntArray(yuv, 256)), out.getPlaneData(1));
        Assert.assertArrayEquals(ArrayUtil.toByteArrayShifted(getAsIntArray(yuv, 256)), out.getPlaneData(2));
    }

    private int[] getAsIntArray(ByteBuffer yuv, int size) {
        byte[] b = new byte[size];
        int[] result = new int[size];
        yuv.get(b);
        for (int i = 0; i < b.length; i++) {
            result[i] = b[i] & 0xff;
        }
        return result;
    }
}
