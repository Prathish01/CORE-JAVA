package specilizationnew;

public class help 
{
public void get(manager m)
{
if(m instanceof pep)
{
pep p = (pep)m;
p.team();
p.league();
p.playstyle();
}
else if(m instanceof klopp)
{
klopp k= (klopp)m;
k.team();
k.league();
k.playstyle();
}

else
{
doncarlo  d= (doncarlo)m;
d.team();
d.league();
d.playstyle();
}
}
}
