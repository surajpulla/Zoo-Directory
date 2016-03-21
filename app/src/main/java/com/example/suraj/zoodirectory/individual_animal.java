package com.example.suraj.zoodirectory;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class individual_animal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_individual_animal);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        Integer[] imgid={
                R.mipmap.lion,
                R.mipmap.elephant,
                R.mipmap.rhino,
                R.mipmap.alligator,
                R.mipmap.cheetah,
                R.mipmap.tiger,
        };
        String lionDesc="The lion (Panthera leo) is one of the five big cats in the genus Panthera and a member of the family Felidae. The commonly used term African lion collectively denotes the several subspecies found in Africa. With some males exceeding 250 kg (550 lb) in weight,[4] it is the second-largest living cat after the tiger. Wild lions currently exist in sub-Saharan Africa and in Asia (where an endangered remnant population resides in Gir Forest National Park in India) while other types of lions have disappeared from North Africa and Southwest Asia in historic times. Until the late Pleistocene, about 10,000 years ago, the lion was the most widespread large land mammal after humans. They were found in most of Africa, across Eurasia from western Europe to India, and in the Americas from the Yukon to Peru.[5] The lion is a vulnerable species, having seen a major population decline in its African range of 30–50% per two decades during the second half of the twentieth century.[2] Lion populations are untenable outside designated reserves and national parks. Although the cause of the decline is not fully understood, habitat loss and conflicts with humans are currently the greatest causes of concern. Within Africa, the West African lion population is particularly endangered.";
        String elephantDesc="Elephants are large mammals of the family Elephantidae and the order Proboscidea. Two species are traditionally recognised, the African elephant (Loxodonta africana) and the Asian elephant (Elephas maximus), although some evidence suggests that African bush elephants and African forest elephants are separate species (L. africana and L. cyclotis respectively). Elephants are scattered throughout sub-Saharan Africa, South Asia, and Southeast Asia. Elephantidae is the only surviving family of the order Proboscidea; other, now extinct, members of the order include deinotheres, gomphotheres, mammoths, and mastodons. Male African elephants are the largest extant terrestrial animals and can reach a height of 4 m (13 ft) and weigh 7,000 kg (15,000 lb). All elephants have several distinctive features the most notable of which is a long trunk or proboscis, used for many purposes, particularly breathing, lifting water and grasping objects. Their incisors grow into tusks, which can serve as weapons and as tools for moving objects and digging. Elephants' large ear flaps help to control their body temperature. Their pillar-like legs can carry their great weight. African elephants have larger ears and concave backs while Asian elephants have smaller ears and convex or level backs.";
        String rhinoDesc="Rhinoceros (/raɪˈnɒsərəs/, meaning \"nose horn\"), often abbreviated to rhino, is a group of five extant species of odd-toed ungulates in the family Rhinocerotidae. Two of these species are native to Africa and three to Southern Asia.\n" + "\n" + "Members of the rhinoceros family are characterized by their large size (they are some of the largest remaining megafauna, with all of the species able to reach one tonne or more in weight); as well as by an herbivorous diet; a thick protective skin, 1.5–5 cm thick, formed from layers of collagen positioned in a lattice structure; relatively small brains for mammals this size (400–600 g); and a large horn. They generally eat leafy material, although their ability to ferment food in their hindgut allows them to subsist on more fibrous plant matter, if necessary. Unlike other perissodactyls, the two African species of rhinoceros lack teeth at the front of their mouths, relying instead on their lips to pluck food.[1]\n" + "\n" + "Rhinoceros are killed by humans for their horns, which are bought and sold on the black market, and which are used by some cultures for ornamental or traditional medicinal purposes. East Asia, specifically Vietnam, is the largest market for rhino horns. By weight, rhino horns cost as much as gold on the black market. People grind up the horns and then consume them believing the dust has therapeutic properties.[2] The horns are made of keratin, the same type of protein that makes up hair and fingernails.[3] Both African species and the Sumatran rhinoceros have two horns, while the Indian and Javan rhinoceros have a single horn.\n" + "\n" + "The IUCN Red List identifies three of the species as critically endangered.";
        String alligatorDesc="An alligator is a crocodilian in the genus Alligator of the family Alligatoridae. The two living species are the American alligator (A. mississippiensis) and the Chinese alligator (A. sinensis). In addition, several extinct species of alligator are known from fossil remains. Alligators first appeared during the Oligocene epoch about 37 million years ago.[1]\n" + "\n" + "The name \"alligator\" is probably an anglicized form of el lagarto, the Spanish term for \"the lizard\", which early Spanish explorers and settlers in Florida called the alligator. Later English spellings of the name included allagarta and alagarto. An average adult American alligator's weight and length is 360 kg (790 lb) and 4.0 m (13.1 ft), but they sometimes grow to 4.4 m (14 ft) long and weigh over 450 kg (990 lb).[3] The largest ever recorded, found in Louisiana, measured 5.84 m (19.2 ft).[4] The Chinese alligator is smaller, rarely exceeding 2.1 m (6.9 ft) in length. In addition, it weighs considerably less, with males rarely over 45 kg.\n" + "\n" + "No average lifespan for an alligator has been measured.[5] In 1937, a one-year-old specimen was brought to the Belgrade Zoo in Serbia from Germany. It is now 76 years old.[6] Although no valid records exist about its date of birth, this alligator, officially named Muja, is considered the oldest alligator living in captivity.[7]";
        String cheetahDesc="The cheetah (Acinonyx jubatus) is a big cat in the subfamily Felinae that inhabits most of Africa and parts of Iran. It is the only extant member of the genus Acinonyx. The cheetah can run as fast as 109.4 to 120.7 km/h (68.0 to 75.0 mph), faster than any other land animal.[3][4][5][6][7][8] It covers distances up to 500 m (1,640 ft) in short bursts, and can accelerate from 0 to 96 km/h (0 to 60 mph) in three seconds.[9] The cheetah's closest extant relatives are the puma and jaguarundi of the Americas. Cheetahs are notable for adaptations in the paws as they are one of the few felids with only semi-retractable claws.[10]\n" + "\n" + "Their main hunting strategy is to trip swift prey such as various antelope species and hares with its dewclaw. Almost every facet of the cheetah's anatomy has evolved to maximise its success in the chase, the result of an evolutionary arms race with its prey. Due to this specialisation, however, the cheetah is poorly equipped to defend itself against other large predators, with speed being its main means of defence. In the wild, the cheetah is a prolific breeder, with up to nine cubs in a litter. The majority of cubs do not survive to adulthood, mainly as a result of depredation from other predators. The rate of cub mortality varies from area to area, from 50% to 75%,[11] and in extreme cases such as the Serengeti ecosystem, up to 90%. Cheetahs are notoriously poor breeders in captivity, though several organizations, such as the De Wildt Cheetah and Wildlife Centre, have succeeded in breeding high numbers of cubs.\n" + "\n" + "The cheetah is listed as vulnerable, facing various threats including loss of habitat and prey; conflict with humans; the illegal pet trade; competition with and predation by other carnivores; and a gene pool with very low variability. It is a charismatic species and many captive cats are \"ambassadors\" for their species and wildlife conservation in general.";
        String tigerDesc="The tiger (Panthera tigris) is the largest cat species, reaching a total body length of up to 3.38 m (11.1 ft) over curves and exceptionally weighing up to 388.7 kg (857 lb) in the wild. Its most recognisable feature is a pattern of dark vertical stripes on reddish-orange fur with a lighter underside. The species is classified in the genus Panthera with the lion, leopard, jaguar and snow leopard. Tigers are apex predators, primarily preying on ungulates such as deer and bovids. They are territorial and generally solitary but social animals, often requiring large contiguous areas of habitat that support their prey requirements. This, coupled with the fact that they are indigenous to some of the more densely populated places on Earth, has caused significant conflicts with humans.\n" + "\n" + "Tigers once ranged widely across Asia, from Turkey in the west to the eastern coast of Russia. Over the past 100 years, they have lost 93% of their historic range, and have been extirpated from southwest and central Asia, from the islands of Java and Bali, and from large areas of Southeast and Eastern Asia. Today, they range from the Siberian taiga to open grasslands and tropical mangrove swamps. The remaining six tiger subspecies have been classified as endangered by IUCN. The global population in the wild is estimated to number between 3,062 and 3,948 individuals, down from around 100,000 at the start of the 20th century, with most remaining populations occurring in small pockets isolated from each other, of which about 2,000 exist on the Indian subcontinent.[4] Major reasons for population decline include habitat destruction, habitat fragmentation and poaching. The extent of area occupied by tigers is estimated at less than 1,184,911 km2 (457,497 sq mi), a 41% decline from the area estimated in the mid-1990s.\n" + "\n" + "Tigers are among the most recognisable and popular of the world's charismatic megafauna. They have featured prominently in ancient mythology and folklore, and continue to be depicted in modern films and literature. They appear on many flags, coats of arms, and as mascots for sporting teams. The tiger is the national animal of Bangladesh, India, Vietnam, Malaysia and South Korea.";

String desc[]={lionDesc,elephantDesc,rhinoDesc,alligatorDesc,cheetahDesc,tigerDesc};

        Bundle sentData= getIntent().getExtras();
        if(sentData==null){
            return;
        }
         String recievedData= sentData.getString("animalName");
        TextView t=(TextView)findViewById(R.id.textView2);
        t.setText(recievedData);

        int recievedImageData=sentData.getInt("imgPosition");
        ImageView individualimage=(ImageView) findViewById(R.id.imageView);
        individualimage.setImageResource(imgid[recievedImageData]);

        TextView animaldescription=(TextView)findViewById(R.id.textView3);
        animaldescription.setText(desc[recievedImageData]);

        setTitle(recievedData);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Toast.makeText(getApplicationContext(), "Settings selected", Toast.LENGTH_SHORT).show();
            return true;
        }

        if (id == R.id.action_zooInfo) {
            Toast.makeText(getApplicationContext(),"Zoo Info",Toast.LENGTH_SHORT ).show();
            Intent i=new Intent(this,zooinfo.class);
            startActivity(i);
            return true;
        }
        if (id == R.id.action_uninstall) {
            Uri packageURI = Uri.parse("package:com.example.suraj.zoodirectory");
            Intent uninstallIntent = new Intent(Intent.ACTION_DELETE, packageURI);
            startActivity(uninstallIntent);

            Toast.makeText(getApplicationContext(),"Uninstall",Toast.LENGTH_SHORT ).show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }



}
