package thanh.effect;

import java.util.ArrayList;

public class Animation {
    private String name;
    private boolean isRepeated; // su lap lai
    private ArrayList<FrameImage> frameImages;
    private int currentFrame; //
    private  ArrayList<Boolean> ignoreFrames;
    private  ArrayList<Double> delayFrames;
    private long beginTime;
    private boolean drawRectFrame; //nen trang ben ngoai
    public Animation() {
        delayFrames = new ArrayList<Double>();

        beginTime = 0;

        ignoreFrames = new ArrayList<Boolean>();

        frameImages = new ArrayList<FrameImage>();

        drawRectFrame = false;

        isRepeated = true;
    }
    public Animation(Animation animation){
        beginTime = animation.beginTime;
        currentFrame = animation.currentFrame;
        drawRectFrame = animation.drawRectFrame;
        isRepeated = animation.isRepeated;

        delayFrames = new ArrayList<Double>();
        for(Double d : animation.delayFrames){
            delayFrames.add(d);
        }
        ignoreFrames = new ArrayList<Boolean>();
        for(boolean b : animation.ignoreFrames) {
            ignoreFrames.add(b);
        }
        frameImages = new ArrayList<FrameImage>();
        for(FrameImage f : animation.frameImages){
            frameImages.add(f);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isRepeated() {
        return isRepeated;
    }

    public void setRepeated(boolean repeated) {
        isRepeated = repeated;
    }

    public ArrayList<FrameImage> getFrameImages() {
        return frameImages;
    }

    public void setFrameImages(ArrayList<FrameImage> frameImages) {
        this.frameImages = frameImages;
    }

    public int getCurrentFrame() {
        return currentFrame;
    }

    public void setCurrentFrame(int currentFrame) {
        this.currentFrame = currentFrame;
    }

    public ArrayList<Boolean> getIgnoreFrames() {
        return ignoreFrames;
    }

    public void setIgnoreFrames(ArrayList<Boolean> ignoreFrames) {
        this.ignoreFrames = ignoreFrames;
    }

    public ArrayList<Double> getDelayFrames() {
        return delayFrames;
    }

    public void setDelayFrames(ArrayList<Double> delayFrames) {
        this.delayFrames = delayFrames;
    }

    public long getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(long beginTime) {
        this.beginTime = beginTime;
    }

    public boolean isDrawRectFrame() {
        return drawRectFrame;
    }

    public void setDrawRectFrame(boolean drawRectFrame) {
        this.drawRectFrame = drawRectFrame;
    }

}
