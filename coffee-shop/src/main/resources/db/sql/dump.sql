PGDMP  5    3    	        
    {            coffee_shop    16.0 (Debian 16.0-1.pgdg120+1)    16.0     *           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            +           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            ,           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            -           1262    16487    coffee_shop    DATABASE     v   CREATE DATABASE coffee_shop WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'en_US.utf8';
    DROP DATABASE coffee_shop;
             	   telexardb    false            �            1259    16489    item    TABLE     �   CREATE TABLE public.item (
    id bigint NOT NULL,
    name character varying(255),
    price double precision NOT NULL,
    status character varying(255)
);
    DROP TABLE public.item;
       public         heap 	   telexardb    false            �            1259    16488    item_id_seq    SEQUENCE     t   CREATE SEQUENCE public.item_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 "   DROP SEQUENCE public.item_id_seq;
       public       	   telexardb    false    216            .           0    0    item_id_seq    SEQUENCE OWNED BY     ;   ALTER SEQUENCE public.item_id_seq OWNED BY public.item.id;
          public       	   telexardb    false    215            �            1259    16498    shop    TABLE     �   CREATE TABLE public.shop (
    id bigint NOT NULL,
    contact_no character varying(255),
    location character varying(255),
    max_size integer NOT NULL,
    no_of_queue integer NOT NULL
);
    DROP TABLE public.shop;
       public         heap 	   telexardb    false            �            1259    16497    shop_id_seq    SEQUENCE     t   CREATE SEQUENCE public.shop_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 "   DROP SEQUENCE public.shop_id_seq;
       public       	   telexardb    false    218            /           0    0    shop_id_seq    SEQUENCE OWNED BY     ;   ALTER SEQUENCE public.shop_id_seq OWNED BY public.shop.id;
          public       	   telexardb    false    217            �            1259    16506 	   shop_item    TABLE     \   CREATE TABLE public.shop_item (
    shop_id bigint NOT NULL,
    item_id bigint NOT NULL
);
    DROP TABLE public.shop_item;
       public         heap 	   telexardb    false            �           2604    16492    item id    DEFAULT     b   ALTER TABLE ONLY public.item ALTER COLUMN id SET DEFAULT nextval('public.item_id_seq'::regclass);
 6   ALTER TABLE public.item ALTER COLUMN id DROP DEFAULT;
       public       	   telexardb    false    216    215    216            �           2604    16501    shop id    DEFAULT     b   ALTER TABLE ONLY public.shop ALTER COLUMN id SET DEFAULT nextval('public.shop_id_seq'::regclass);
 6   ALTER TABLE public.shop ALTER COLUMN id DROP DEFAULT;
       public       	   telexardb    false    217    218    218            $          0    16489    item 
   TABLE DATA           7   COPY public.item (id, name, price, status) FROM stdin;
    public       	   telexardb    false    216   �       &          0    16498    shop 
   TABLE DATA           O   COPY public.shop (id, contact_no, location, max_size, no_of_queue) FROM stdin;
    public       	   telexardb    false    218   �       '          0    16506 	   shop_item 
   TABLE DATA           5   COPY public.shop_item (shop_id, item_id) FROM stdin;
    public       	   telexardb    false    219   �       0           0    0    item_id_seq    SEQUENCE SET     :   SELECT pg_catalog.setval('public.item_id_seq', 1, false);
          public       	   telexardb    false    215            1           0    0    shop_id_seq    SEQUENCE SET     :   SELECT pg_catalog.setval('public.shop_id_seq', 1, false);
          public       	   telexardb    false    217            �           2606    16496    item item_pkey 
   CONSTRAINT     L   ALTER TABLE ONLY public.item
    ADD CONSTRAINT item_pkey PRIMARY KEY (id);
 8   ALTER TABLE ONLY public.item DROP CONSTRAINT item_pkey;
       public         	   telexardb    false    216            �           2606    16505    shop shop_pkey 
   CONSTRAINT     L   ALTER TABLE ONLY public.shop
    ADD CONSTRAINT shop_pkey PRIMARY KEY (id);
 8   ALTER TABLE ONLY public.shop DROP CONSTRAINT shop_pkey;
       public         	   telexardb    false    218            �           2606    16514 %   shop_item fkbhqd8ctkbitg46dxocg0mdjas    FK CONSTRAINT     �   ALTER TABLE ONLY public.shop_item
    ADD CONSTRAINT fkbhqd8ctkbitg46dxocg0mdjas FOREIGN KEY (shop_id) REFERENCES public.shop(id);
 O   ALTER TABLE ONLY public.shop_item DROP CONSTRAINT fkbhqd8ctkbitg46dxocg0mdjas;
       public       	   telexardb    false    219    3217    218            �           2606    16509 %   shop_item fkf7wo1ik687pypg6c44o27usfb    FK CONSTRAINT     �   ALTER TABLE ONLY public.shop_item
    ADD CONSTRAINT fkf7wo1ik687pypg6c44o27usfb FOREIGN KEY (item_id) REFERENCES public.item(id);
 O   ALTER TABLE ONLY public.shop_item DROP CONSTRAINT fkf7wo1ik687pypg6c44o27usfb;
       public       	   telexardb    false    3215    216    219            $      x������ � �      &      x������ � �      '      x������ � �     