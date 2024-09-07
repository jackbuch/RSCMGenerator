/*
 * Copyright (c) 2016-2017, Adam <Adam@sigterm.info>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package cache.definitions;

import java.util.Map;

public class ObjectDefinition
{
    public int id;
    private short[] retextureToFind;
    private int decorDisplacement = 16;
    private boolean isHollow = false;
    public String name = "null";
    private int[] objectModels;
    private int[] objectTypes;
    private short[] recolorToFind;
    private int mapAreaId = -1;
    private short[] textureToReplace;
    private int sizeX = 1;
    private int sizeY = 1;
    private int ambientSoundDistance = 0;
    private int[] ambientSoundIds;
    private int ambientSoundRetain;
    private int offsetX = 0;
    private boolean mergeNormals = false;
    private int wallOrDoor = -1;
    private int animationID = -1;
    private int varbitID = -1;
    private int ambient = 0;
    private int contrast = 0;
    private String[] actions = new String[5];
    private int interactType = 2;
    private int mapSceneID = -1;
    private int blockingMask = 0;
    private short[] recolorToReplace;
    private boolean shadow = true;
    private int modelSizeX = 128;
    private int modelSizeHeight = 128;
    private int modelSizeY = 128;
    private int objectID;
    private int offsetHeight = 0;
    private int offsetY = 0;
    private boolean obstructsGround = false;
    private int contouredGround = -1;
    private int supportsItems = -1;
    private int[] configChangeDest;
    private int category;
    private boolean isRotated = false;
    private int varpID = -1;
    private int ambientSoundId = -1;
    private boolean aBool2111 = false;
    private int ambientSoundChangeTicksMin = 0;
    private int ambientSoundChangeTicksMax = 0;
    private boolean blocksProjectile = true;
    private boolean randomizeAnimStart;
    private boolean deferAnimChange;
    private Map<Integer, Object> params = null;

    public void setId(int id) {
        this.id = id;
    }

    public void setRetextureToFind(short[] retextureToFind) {
        this.retextureToFind = retextureToFind;
    }

    public void setDecorDisplacement(int decorDisplacement) {
        this.decorDisplacement = decorDisplacement;
    }

    public void setHollow(boolean hollow) {
        isHollow = hollow;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setObjectModels(int[] objectModels) {
        this.objectModels = objectModels;
    }

    public void setObjectTypes(int[] objectTypes) {
        this.objectTypes = objectTypes;
    }

    public void setRecolorToFind(short[] recolorToFind) {
        this.recolorToFind = recolorToFind;
    }

    public void setMapAreaId(int mapAreaId) {
        this.mapAreaId = mapAreaId;
    }

    public void setTextureToReplace(short[] textureToReplace) {
        this.textureToReplace = textureToReplace;
    }

    public void setSizeX(int sizeX) {
        this.sizeX = sizeX;
    }

    public void setSizeY(int sizeY) {
        this.sizeY = sizeY;
    }

    public void setAmbientSoundDistance(int ambientSoundDistance) {
        this.ambientSoundDistance = ambientSoundDistance;
    }

    public void setAmbientSoundIds(int[] ambientSoundIds) {
        this.ambientSoundIds = ambientSoundIds;
    }

    public void setAmbientSoundRetain(int ambientSoundRetain) {
        this.ambientSoundRetain = ambientSoundRetain;
    }

    public void setOffsetX(int offsetX) {
        this.offsetX = offsetX;
    }

    public void setMergeNormals(boolean mergeNormals) {
        this.mergeNormals = mergeNormals;
    }

    public void setWallOrDoor(int wallOrDoor) {
        this.wallOrDoor = wallOrDoor;
    }

    public void setAnimationID(int animationID) {
        this.animationID = animationID;
    }

    public void setVarbitID(int varbitID) {
        this.varbitID = varbitID;
    }

    public void setAmbient(int ambient) {
        this.ambient = ambient;
    }

    public void setContrast(int contrast) {
        this.contrast = contrast;
    }

    public String[] getActions() {
        return actions;
    }

    public void setInteractType(int interactType) {
        this.interactType = interactType;
    }

    public void setMapSceneID(int mapSceneID) {
        this.mapSceneID = mapSceneID;
    }

    public void setBlockingMask(int blockingMask) {
        this.blockingMask = blockingMask;
    }

    public void setRecolorToReplace(short[] recolorToReplace) {
        this.recolorToReplace = recolorToReplace;
    }

    public void setShadow(boolean shadow) {
        this.shadow = shadow;
    }

    public void setModelSizeX(int modelSizeX) {
        this.modelSizeX = modelSizeX;
    }

    public void setModelSizeHeight(int modelSizeHeight) {
        this.modelSizeHeight = modelSizeHeight;
    }

    public void setModelSizeY(int modelSizeY) {
        this.modelSizeY = modelSizeY;
    }

    public void setOffsetHeight(int offsetHeight) {
        this.offsetHeight = offsetHeight;
    }

    public void setOffsetY(int offsetY) {
        this.offsetY = offsetY;
    }

    public void setObstructsGround(boolean obstructsGround) {
        this.obstructsGround = obstructsGround;
    }

    public void setContouredGround(int contouredGround) {
        this.contouredGround = contouredGround;
    }

    public void setSupportsItems(int supportsItems) {
        this.supportsItems = supportsItems;
    }

    public void setConfigChangeDest(int[] configChangeDest) {
        this.configChangeDest = configChangeDest;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public void setRotated(boolean rotated) {
        isRotated = rotated;
    }

    public void setVarpID(int varpID) {
        this.varpID = varpID;
    }

    public void setAmbientSoundId(int ambientSoundId) {
        this.ambientSoundId = ambientSoundId;
    }

    public void setABool2111(boolean aBool2111) {
        this.aBool2111 = aBool2111;
    }

    public void setAmbientSoundChangeTicksMin(int ambientSoundChangeTicksMin) {
        this.ambientSoundChangeTicksMin = ambientSoundChangeTicksMin;
    }

    public void setAmbientSoundChangeTicksMax(int ambientSoundChangeTicksMax) {
        this.ambientSoundChangeTicksMax = ambientSoundChangeTicksMax;
    }

    public void setBlocksProjectile(boolean blocksProjectile) {
        this.blocksProjectile = blocksProjectile;
    }

    public void setRandomizeAnimStart(boolean randomizeAnimStart) {
        this.randomizeAnimStart = randomizeAnimStart;
    }

    public void setDeferAnimChange(boolean deferAnimChange) {
        this.deferAnimChange = deferAnimChange;
    }

    public void setParams(Map<Integer, Object> params) {
        this.params = params;
    }
}
